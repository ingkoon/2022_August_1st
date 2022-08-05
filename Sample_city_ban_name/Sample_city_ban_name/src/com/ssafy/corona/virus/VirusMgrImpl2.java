package com.ssafy.corona.virus;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class VirusMgrImpl2 implements VirusMgr {
	private List<Virus> virus;
	private int index;
	
	private static VirusMgr manager = new VirusMgrImpl2();
	
	
	private VirusMgrImpl2() {
		load();
	}
	
	public static VirusMgr getInstance() {
		return manager;
	}
	
	private void load() {
		File f = new File("virus.dat");
		if(!f.exists()) {
			virus = new ArrayList<>();
		}else {
			try(ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream(f))) {
				virus = (ArrayList<Virus>) ois.readObject();
			} catch (Exception e) {
				System.out.println("System Error: 파일을 정상적으로 읽지 못했습니다.]");
			}
		}
	}
	
	@Override
	public void add(Virus v) throws DuplicatedException{
		try {
			search(v.getName());
			throw new DuplicatedException("중복된 이름입니다");
		} catch (NotFoundException e) {
			virus.add(v);			
		}
	}
	
	@Override
	public Virus[] search() {
		return virus.toArray(new Virus[virus.size()]);
	}
	@Override
	public Virus search(String name) throws NotFoundException{		
		for(Virus v  : virus) {
			//if(v.getName().equals(name)) return v
			//
			if(v.getName().equals(name)) return v;
		}
		throw new NotFoundException(name+": 미등록 바이러스입니다.");
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		try(ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("virus.dat"))) {
			oos.writeObject(virus);
			oos.flush();
		} catch (Exception e) {
			System.out.println("System Error: 파일을 정상적으로 저장하지 못했습니다.]");
		}
		virus = null;
	}

	@Override
	public void sortByName() {
		virus.sort(new ByNameComp()); // 기준을 제공하자
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortByLevel() {
		virus.sort(new ByLevelComp());
		// TODO Auto-generated method stub
		
	}
}
