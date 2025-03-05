package org.sample;

import java.util.LinkedList;
import java.util.List;

public class Amazon {
	public static void main(String[] args) {
		List<Integer>l=new LinkedList<Integer>();
		l.add(10);
		l.add(50);
		l.add(30);
		l.add(20);
		l.add(60);
		List<Integer>p=new LinkedList<Integer>();
		p.add(10);
		p.add(50);
		p.add(30);
		p.add(20);
		p.add(60);
		System.out.println(l);
		int d = l.size();
		System.out.println(d);
		int o = l.indexOf(10);
		System.out.println(o);
		var retainAll = p.retainAll(l);
		System.out.println(retainAll);
		boolean all = p.removeAll(l);
		System.out.println(all);
		
		
		
		
		
			
			
		}
		
		}

