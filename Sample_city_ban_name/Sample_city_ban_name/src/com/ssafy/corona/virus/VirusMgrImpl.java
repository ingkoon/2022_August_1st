package com.ssafy.corona.virus;

import java.util.Arrays;

public class VirusMgrImpl implements VirusMgr {
	private Virus[] virus;
	private int index;
	
	//--싱글톤 패턴을 위한 private 생성자
	private static VirusMgr manager = new VirusMgrImpl();
	private VirusMgrImpl() {
		virus=new Virus[100];		
	}
	
	public static VirusMgr getInstance() {
		return manager;
	}
	
	//-- 싱글톤 끝!
	
	@Override
	public void add(Virus v) throws DuplicatedException{
		try {
			search(v.getName());
			throw new DuplicatedException("이미 존재하는 바이러스 입니다.");
		} catch (NotFoundException e) {
			virus[index++]=v;
		} 
/*		catch (DuplicatedException e) {
			throw e;
		} //만냑 duplicated 예외처리하면 다시 던져야 한다.
*/	
	}
	@Override
	public Virus[] search() {
		return Arrays.copyOf(virus, index);
	}
	@Override
	public Virus search(String name) throws NotFoundException{
		for(int i=0; i<index; i++) { // index로 바꾸어서 null이 나오지 않게 하자.
			if(virus[i].getName().equals(name)) return virus[i]; //객체간의 비교를 위해 equals overrding이 필요할 수 있다.
		}
		throw new NotFoundException(name+": 미등록 바이러스입니다.");
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortByName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortByLevel() {
		// TODO Auto-generated method stub
		
	}
}
