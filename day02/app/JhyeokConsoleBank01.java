package app;

import java.util.Scanner;

import bank.Account;
import bank.AccountMemDao;

public class JhyeokConsoleBank01 {
	
	
	static String[] startMenu = {"1. 계좌 등록, 2. 계좌조회, 3. 입금, 4. 출금, 0. 종료"};
	static Scanner scan = new Scanner(System.in);
	static AccountMemDao accountDao = new AccountMemDao(); 
	
	public static void main(String[] args) {
		welcomeMessage();
		startBankMenu();
		sayGoodbye();
	}
	
	public static void welcomeMessage() {
		System.out.println("            Welcome JheyokConsole Bank            ");
		System.out.println("-".repeat(50));
	}
	
	public static void startBankMenu() {
		boolean isRunning = true; // 무한 루프 제어용 변수
		
		while(isRunning) {
			int menu = getMenu(startMenu);
			switch (menu){
			case 1: // 계좌등록
				menuAccountRegist();
				break;
			case 2: // 계좌조회
				menuAccountList();
				break;
			case 3: // 입금
				menuDeposit();
				break;
			case 4: // 출금
				menuwidthdraw();
				break;
			case 0: // 종료
				isRunning = false; // while 문을 빠져나가도록 설정
				break;
			default: // 없는 메뉴
				System.out.println("없는 메뉴입니다.");
			}
		}
	}
	
	public static void menuwidthdraw() {
		System.out.println();
		System.out.println("[출금]");
		System.out.print("계좌번호 : ");
		int accountNo = Integer.parseInt(scan.nextLine()); 
		
		System.out.print("출금액 : ");
		int amount = Integer.parseInt(scan.nextLine());

		// dao에게 출금 요청
		if (accountDao.withdraw(accountNo, amount)) {
			System.out.println("출금하였습니다.");
			System.out.println(">> " + accountDao.getAccount(accountNo));
		} else {
			System.out.println("출금할 수 없습니다.");
		}
	}
	
	private static void showAccountList() {
		Account[] accountList = accountDao.selectAll();
		for (int i = 0; i < accountList.length; i++){
			System.out.println(accountList[i]);
		}
	} 

	public static void menuDeposit() {
		System.out.println();
		System.out.print("계좌번호 : ");
		int accountNo = Integer.parseInt(scan.nextLine()); 
		
		System.out.print("입금액 : ");
		int amount = Integer.parseInt(scan.nextLine());

		// dao에게 입금 요청
		if (accountDao.deposit(accountNo, amount)) {
			System.out.println("입금하였습니다.");
			System.out.println(">> " + accountDao.getAccount(accountNo));
		} else {
			System.out.println("입금할 수 없습니다.");
		}
	}

	public static void menuAccountList() {
		System.out.println("[계좌 조회]");
		showAccountList(); // 띄어쓰기 오타 수정
	}

	public static void menuAccountRegist() {
		System.out.println("[계좌 등록]");
		System.out.print("계좌주 : ");
		String owner = scan.nextLine();
		
		System.out.print("비밀번호 : ");
		String password = scan.nextLine();
		
		System.out.print("초기입금액 : ");
		int amount = Integer.parseInt(scan.nextLine());
		
		if (accountDao.insertAccount(owner, password, amount)) {
			System.out.println("계좌를 등록했습니다.");
			System.out.println(">> " + accountDao.getAccount(AccountMemDao.noSeq - 1));
		} else {
			System.out.println("계좌를 등록할 수 없습니다.");
		}
	}

	public static int getMenu(String[] menuList) {
		// 메뉴출력
		for (int i = 0; i < menuList.length; i++) {
			System.out.println(menuList[i]);
		}
		System.out.println("-".repeat(50));
		System.out.print("> 메뉴 선택 : ");
		
		// 새로운 Scanner 객체 생성 대신 기존의 static scan 객체 재사용
		// 버퍼에 엔터가 남는 것을 방지하기 위해 nextLine() 호출 후 int로 변환
		int menu = Integer.parseInt(scan.nextLine()); 
		return menu;
	}
	
	private static void sayGoodbye() {
		// 종료 멘트로 수정
		System.out.println("Jhyeok Console Bank를 이용해 주셔서 감사합니다.");
	}

}
