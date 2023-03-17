abstract class AURCTBank{

double balanceCSE = 100000;
double balanceECE= 300000;
double balanceGEO= 500000;
abstract void balanceCheck();

}

class BankCSE extends AURCTBank{

void balanceCheck() {

System.out.println("Balance of CSE Bank: "+balanceCSE);
}
}

class BankECE extends AURCTBank{

void balanceCheck() {

System.out.println("Balance of ECE Bank: "+balanceECE);
}
}

class BankGEO extends AURCTBank{ 
void balanceCheck() {

System.out.println("Balance of GEO Bank: "+balanceGEO);

}
}

public class ex3 {

public static void main(String[] args) {

BankCSE CSE= new BankCSE();

BankECE ECE= new BankECE();

BankGEO GEO= new BankGEO();

CSE.balanceCheck();

ECE.balanceCheck();

GEO.balanceCheck();
}
}
