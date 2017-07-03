package com.chen.algorithm;

interface CallBack {
	public void solve(String result);
}

class Wang implements CallBack {
	private Li li;

	public Wang(Li li) {
		this.li = li;
	}

	public void askQuestion(final String question) {
		// 这里用一个线程就是异步，
		new Thread(new Runnable() {
			@Override
			public void run() {
				li.executeMessage(Wang.this, question);
			}
		}).start();
		play();
	}

	public void play() {
		System.out.println("我要逛街去了");
	}

	@Override
	public void solve(String result) {
		System.out.println("小李告诉小王的答案是--->" + result);
	}

}

class Li {
	public void executeMessage(CallBack callBack, String question) {
		System.out.println("小王问的问题--->" + question);

		// 模拟小李办自己的事情需要很长时间
		for (int i = 0; i < 10000; i++) {
		}
		String result = "答案是2";
		callBack.solve(result);
	}
}

public class InterfaceReturn {
	public static void main(String[] args) {
		Li li = new Li();
		Wang wang = new Wang(li);
		wang.askQuestion("1 + 1 = ?");
	}
}
