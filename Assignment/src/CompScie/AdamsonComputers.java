package CompScie;

public class AdamsonComputers {

	public static void main(String[] args) {
		System.out.println("*************************Adamson Computers Ltd************************************");
		System.out.println("#99 ACS Building Gilmore Ave.New Mla.. Quezon City * Tel. No:123-4567");
		System.out.println("\t\t     VAT REG.TIN 098-765-4321-0000");
		System.out.println("\t\t\t   SALES INVOICE");
		String Soldto;
		Soldto="C026-01-0948/2022";
		String Address;
		Address="Davyne Chebet Faith";
		System.out.println("Sold to:"+Soldto + "\t\t\t     Date:28/04/2020");
		System.out.println("Address:"+Address + "\t\t\t      Contact Number:0100100100");
		System.out.println("===================================================================================");
		int Qty1=4 , Qty2=10, Qty3=9, Qty4=10; 
		int UnitPrice1=20,UnitPrice2=50,UnitPrice3=30,UnitPrice4=80;
		double Amount1,Amount2,Amount3,Amount4;
		Amount1 = Qty1 * UnitPrice1;
		Amount2 = Qty2 * UnitPrice2;
		Amount3 = Qty3 * UnitPrice3;
		Amount4 = Qty4 * UnitPrice4;
		System.out.println("Qty\t|\tItem Description\t|\tUnit Price\t|\tAmount\t");
		System.out.println("===================================================================================");
		System.out.println(Qty1+"\t|\tPencil\t\t\t|\t"+UnitPrice1+"\t\t|\t"+Amount1);
		System.out.println(Qty2+"\t|\tDuster\t\t\t|\t"+UnitPrice2+"\t\t|\t"+Amount2);
		System.out.println(Qty3+"\t|\tPens\t\t\t|\t"+UnitPrice3+"\t\t|\t"+Amount3);
		System.out.println(Qty4+"\t|\tCrayon\t\t\t|\t"+UnitPrice4+"\t\t|\t"+Amount4);
		System.out.println("===================================================================================");
		double SubTotal = Amount1 +Amount2+Amount3+Amount4;
		System.out.println("\t\t\t\t\t\t|Sub Total\t|\t"+SubTotal);
		System.out.println("\t\t\t\t\t\t===================================");
		double vat=(SubTotal * 16)/100;
		System.out.println("\t\t\t\t\t\t|VAT(16%)\t|\t"+vat);
		System.out.println("\t\t\t\t\t\t===================================");
		double Total=SubTotal+vat;
		System.out.println("\t\t\t\t\t\t|Total Amount\t|\t"+Total);
		System.out.println("\t\t\t\t\t\t===================================");
		
		
		
		
		
		
	  

	}

}
