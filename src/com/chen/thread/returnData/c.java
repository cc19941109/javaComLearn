package com.chen.thread.returnData;

/**
 * 回调实现多线程传递数据
 * Created by Sean on 2017/5/9.
 */
class Data {
    public int value = 0;
}

class Work {
    public void process(Data data, Integer[] numbers) {
        for (int n : numbers) {
            data.value += n;
        }
    }
}


class Thread10 extends Thread {
    private Work work;

    public Thread10(Work work) {
        this.work = work;
    }

    @Override
    public void run() {
        super.run();
        Integer[] numbers = new Integer[3];
        java.util.Random random = new java.util.Random();
        Data data = new Data();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        work.process(data,numbers);
        System.out.println(String.valueOf(numbers[0]) + "+" + String.valueOf(numbers[1]) + "+"
                + String.valueOf(numbers[2]) + "=" + data.value);
    }

    public static void main(String[] args)
    {
        Thread thread = new Thread10(new Work());
        thread.start();
    }
}