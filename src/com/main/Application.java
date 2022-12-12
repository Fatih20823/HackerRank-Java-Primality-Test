package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Application {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        boolean result;
        
        BigInteger b = new BigInteger(n);
        result = b.isProbablePrime(1);
        
        if (result==true) {
        	System.out.println("prime");
        }else {
        	System.out.println("not prime");
        }
        		
        bufferedReader.close();
        
        // Input(stdin)
        
        // 2367495770217142995264827948666809233066409497699870112003149352380375124855230068487109373226251982
        
        // Expected Output
        
        // prime
	}

}
