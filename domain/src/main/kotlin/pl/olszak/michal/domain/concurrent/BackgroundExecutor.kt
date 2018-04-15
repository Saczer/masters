package pl.olszak.michal.domain.concurrent

import pl.olszak.michal.base.concurrent.ThreadExecutor
import java.util.concurrent.LinkedBlockingQueue
import java.util.concurrent.ThreadFactory
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicInteger
import javax.inject.Inject

class BackgroundExecutor @Inject constructor() : ThreadExecutor {

    private val queue: LinkedBlockingQueue<Runnable> = LinkedBlockingQueue()
    private val threadFactory = JobThreadFactory()
    private val threadPoolExecutor = ThreadPoolExecutor(INITIAL_SIZE,
            MAX_SIZE,
            ALIVE_TIME,
            TimeUnit.SECONDS,
            queue,
            threadFactory)


    override fun execute(command: Runnable?) {
        command?.let {
            threadPoolExecutor.execute(it)
        }
    }

    private class JobThreadFactory : ThreadFactory {

        private val counter = AtomicInteger()

        override fun newThread(runnable: Runnable?): Thread {
            val thread = Thread(runnable)
            thread.name = NAME + counter.incrementAndGet()
            return thread
        }

        companion object {
            private const val NAME = "masters-thread-"
        }

    }

    companion object {
        private val CPU_COUNT = Runtime.getRuntime().availableProcessors()
        private const val INITIAL_SIZE = 2
        private val MAX_SIZE = Math.max(INITIAL_SIZE, Math.min(CPU_COUNT - 1, 5))
        private const val ALIVE_TIME = 30L

    }
}