package Generics;

import java.util.LinkedList;
import java.util.Queue;

public class PrimeNumbers {
    public static void main(String[] args) {
        Queue<Integer> primeNumbers=new LinkedList<>();
        int queueSize=primeNumbers.size();
        int number=2;
        while (queueSize<50){
            if(isPrime(number)){
                primeNumbers.add(number);
            }
            number++;
            queueSize=primeNumbers.size();
        }
        for (Integer i:primeNumbers){
            System.out.println(i);
        }
        System.out.println(primeNumbers.size());
    }
    public static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
