package com.javatest.ex;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {

	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {
		
		String signatureStr = joinPoint.getSignature().toShortString(); // Ÿ�� �޼����� signature ����
		System.out.println(signatureStr + "�޼��尡 ���۵Ǿ����ϴ�.");
		long st = System.currentTimeMillis(); // �޼��� ȣ�� �� ���� �ð��� long�� ������ ����
		
		try {
			Object obj = joinPoint.proceed(); // Ÿ���� �޼���(�ٽ� ���)�� ȣ��
			return obj;
		}finally {
			long et = System.currentTimeMillis(); // �޼��� ȣ�� �� ���� �ð�
			System.out.println(signatureStr + "�޼��尡 ����Ǿ����ϴ�.");
			System.out.println(signatureStr + "�޼����� �۾� ����ð� : " + (et - st) + "ms" );
		}
	}
	
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("beforeAdvice ����" );
	}
	
	public void afterReturnAdvice(JoinPoint joinPoint) {
		System.out.println("afterReturnAdvice ����" );
	}
	
	public void afterThrowAdivce(JoinPoint joinPoint) {
		System.out.println("afterThrowAdivce ����" );
	}
	public void afterAdivce(JoinPoint joinPoint) {
		System.out.println("afterAdivce ����" );
	}
		
}