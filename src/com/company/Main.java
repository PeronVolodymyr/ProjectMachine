package com.company;

public class Main {

    public static void main(String[] args) {
	TraktorWheel trWh = new TraktorWheel("John Deere",100,5000,2,4);
	TractorClawler trCl = new TractorClawler("T-150",50,3000, 1, 4);
	System.out.println(trWh);
	System.out.println(trCl);
    }
}
