class Solution {

    public boolean canFinish(long T, int mountainHeight, int[] workerTimes) {

        long total = 0;

        for (int w : workerTimes) {

            long val = (2 * T) / w;
            long x = (long)((Math.sqrt(1 + 4 * val) - 1) / 2);

            total += x;

            if (total >= mountainHeight)
                return true;
        }

        return total >= mountainHeight;
    }

    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {

        long left = 0;

        int minWorker = Integer.MAX_VALUE;
        for (int w : workerTimes)
            minWorker = Math.min(minWorker, w);

        long right = (long)minWorker * mountainHeight * (mountainHeight + 1) / 2;

        while (left < right) {

            long mid = left + (right - left) / 2;

            if (canFinish(mid, mountainHeight, workerTimes))
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }
}