
package iso;

import java.util.Scanner;

public class iso {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert ISO without empty spaces: ");
        iso b = new iso(scanner.nextLine());
        System.out.print("\n"+b.toString());
        
    }
    
    public String m; //Iso Message
    private final int a = 50; //Distance between columns for output 
    private int j = 0;//Helper of index
    private int i = 0; //index for get the different positions
    private String z = ""; //String helper for stored temporaly the value of each position for get the meaning
    private String PrimaryBit;
    private String SecondaryBit;
    private String ProductIndicator;
    
    
    @Override
    public String toString()    {       
        
        String s = "";
        try{
        s = ToStringProductIndicatorType()+ToStringReleaseNumber()+ToStringStatus()+ToStringOriginatorCode()+ToStringResponderCode()+ToStringMti();
        
        PrimaryBit = GetPrimaryBit();
        s += ToStringPrimaryBit(PrimaryBit);
        
        if(convertToBinary(PrimaryBit).charAt(0)=='1'){
            
            SecondaryBit = ToStringP1();
            s += SecondaryBit;
        
        }
         
        for (int w = 1; w < convertToBinary(PrimaryBit).length(); w++) {
            if (convertToBinary(PrimaryBit).charAt(w) == '1') {
                switch (w+1) {
                    case 2 -> s = s + ToStringP2();
                    case 3 -> s += ToStringP3();
                    case 4 -> s += ToStringP4();
                    case 5 -> s += ToStringP5();
                    case 6 -> s += ToStringP6();
                    case 7 -> s += ToStringP7();
                    case 8 -> s += ToStringP8();
                    case 9 -> s += ToStringP9();
                    case 10 -> s += ToStringP10();
                    case 11 -> s += ToStringP11();
                    case 12 -> s += ToStringP12();
                    case 13 -> s += ToStringP13();
                    case 14 -> s += ToStringP14();
                    case 15 -> s += ToStringP15();
                    case 16 -> s += ToStringP16();
                    case 17 -> s += ToStringP17();
                    case 18 -> s += ToStringP18();
                    case 19 -> s += ToStringP19();
                    case 20 -> s += ToStringP20();
                    case 21 -> s += ToStringP21();
                    case 22 -> s += ToStringP22();
                    case 23 -> s += ToStringP23();
                    case 24 -> s += ToStringP24();
                    case 25 -> s += ToStringP25();
                    case 26 -> s += ToStringP26();
                    case 27 -> s += ToStringP27();
                    case 28 -> s += ToStringP28();
                    case 29 -> s += ToStringP29();
                    case 30 -> s += ToStringP30();
                    case 31 -> s += ToStringP31();
                    case 32 -> s += ToStringP32();
                    case 33 -> s += ToStringP33();
                    case 34 -> s += ToStringP34();
                    case 35 -> s += ToStringP35();
                    case 36 -> s += ToStringP36();
                    case 37 -> s += ToStringP37();
                    case 38 -> s += ToStringP38();
                    case 39 -> s += ToStringP39();
                    case 40 -> s += ToStringP40();
                    case 41 -> s += ToStringP41();
                    case 42 -> s += ToStringP42();
                    case 43 -> s += ToStringP43();
                    case 44 -> s += ToStringP44();
                    case 45 -> s += ToStringP45();
                    case 46 -> s += ToStringP46();
                    case 47 -> s += ToStringP47();
                    case 48 -> s += ToStringP48();
                    case 49 -> s += ToStringP49();
                    case 50 -> s += ToStringP50();
                    case 51 -> s += ToStringP51();
                    case 52 -> s += ToStringP52();
                    case 53 -> s += ToStringP53();
                    case 54 -> s += ToStringP54();
                    case 55 -> s += ToStringP55();
                    case 56 -> s += ToStringP56();
                    case 57 -> s += ToStringP57();
                    case 58 -> s += ToStringP58();
                    case 59 -> s += ToStringP59();
                    case 60 -> s += ToStringP60();
                    case 61 -> s += ToStringP61();
                    case 62 -> s += ToStringP62();
                    case 63 -> s += ToStringP63();
                    case 64 -> s += ToStringP64();      
                }
            }
        }
            
        
        if(SecondaryBit != null){
        for (int w = 0; i < convertToBinary(SecondaryBit).length(); w++) {
            if (convertToBinary(SecondaryBit).charAt(w) == '1') {
                switch (w) {
                    case 0 -> s += ToStringP65();
                    case 1 -> s += ToStringP66();
                    case 2 -> s += ToStringP67();
                    case 3 -> s += ToStringP68();
                    case 4 -> s += ToStringP69();
                    case 5 -> s += ToStringP70();
                    case 6 -> s += ToStringP71();
                    case 7 -> s += ToStringP72();
                    case 8 -> s += ToStringP73();
                    case 9 -> s += ToStringP74();
                    case 10 -> s += ToStringP75();
                    case 11 -> s += ToStringP76();
                    case 12 -> s += ToStringP77();
                    case 13 -> s += ToStringP78();
                    case 14 -> s += ToStringP79();
                    case 15 -> s += ToStringP80();
                    case 16 -> s += ToStringP81();
                    case 17 -> s += ToStringP82();
                    case 18 -> s += ToStringP83();
                    case 19 -> s += ToStringP84();
                    case 20 -> s += ToStringP85();
                    case 21 -> s += ToStringP86();
                    case 22 -> s += ToStringP87();
                    case 23 -> s += ToStringP88();
                    case 24 -> s += ToStringP89();
                    case 25 -> s += ToStringP90();
                    case 26 -> s += ToStringP91();
                    case 27 -> s += ToStringP92();
                    case 28 -> s += ToStringP93();
                    case 29 -> s += ToStringP94();
                    case 30 -> s += ToStringP95();
                    case 31 -> s += ToStringP96();
                    case 32 -> s += ToStringP97();
                    case 33 -> s += ToStringP98();
                    case 34 -> s += ToStringP99();
                    case 35 -> s += ToStringP100(); 
                    case 36 -> s += ToStringP101();
                    case 37 -> s += ToStringP102();
                    case 38 -> s += ToStringP103();
                    case 39 -> s += ToStringP104();
                    case 40 -> s += ToStringP105();
                    case 41 -> s += ToStringP106();
                    case 42 -> s += ToStringP107();
                    case 43 -> s += ToStringP108();
                    case 44 -> s += ToStringP109();
                    case 45 -> s += ToStringP110();
                    case 46 -> s += ToStringP111();
                    case 47 -> s += ToStringP112();
                    case 48 -> s += ToStringP113();
                    case 49 -> s += ToStringP114();
                    case 50 -> s += ToStringP115();
                    case 51 -> s += ToStringP116();
                    case 52 -> s += ToStringP117();
                    case 53 -> s += ToStringP118();
                    case 54 -> s += ToStringP119();
                    case 55 -> s += ToStringP120();
                    case 56 -> s += ToStringP121();
                    case 57 -> s += ToStringP122();
                    case 58 -> s += ToStringP123();
                    case 59 -> s += ToStringP124();
                    case 60 -> s += ToStringP125();
                    case 61 -> s += ToStringP126();
                    case 62 -> s += ToStringP127();
                    case 63 -> s += ToStringP128();
                    default -> s += "Otro valor";
                }
            }
        }}
        
        }
        catch(Exception e){
            //System.out.print(e.getMessage());
        }
        return s;
    }
    
    public iso(String m){
        if (m.contains("ISO")) 
            i = m.indexOf("O")+1;
        this.m = m;
    }    
    public iso(){
       this.m = "";
    }   
    public String GetIsoM(){
        return m;
    }    
    public void SetIsoM(String m){
        if (m.contains("ISO")) 
            i = m.indexOf("O")+1;
        this.m = m;
    }
    
    public String convertToBinary(String S) {
        StringBuilder binaryStringBuilder = new StringBuilder();

        for (int x = 0; x < 16; x++) {
            char hexChar = S.charAt(x);
          // exchange value to binary
            int intValue = Integer.parseInt(String.valueOf(hexChar), 16);
            String binaryValue = String.format("%4s", Integer.toBinaryString(intValue)).replace(' ', '0');         
            binaryStringBuilder.append(binaryValue);
        }
        // Retobrna el resultado como un String
        return binaryStringBuilder.toString();
    }
       
    public String GetProductIndicatorType(){
        j=i;
        i=i+2;
        return m.substring(j, i);
    }
    public String ToStringProductIndicatorType(){
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-"+a+"s%-"+a+"s%-"+a+"s%n", "Product Indicator", z=GetProductIndicatorType(), GetMeanProductIndicatorType()));
        ProductIndicator = z;
        return f.toString();
    }
    public String GetMeanProductIndicatorType(){
        switch(z){
            case "00" -> {
                return "Base(network managment messages)";
            }
            case "01" -> {
                return "Base24-atm";
            }
            case "02" -> {
                return "Base 24-pos";
            }
            case "03" -> {
                return "Base24-teller";
            }
            case "08" -> {
                return "Base24-from host maintenance";
            }
            case "14" -> {
                return "Base24-telebanking";
            }
            default -> {
                return "Invalid output";
            }
        }
    }
    
    public String GetReleaseNumber(){
        j=i;
        i=i+2;
        return m.substring(j, i);
    }
    public String ToStringReleaseNumber(){
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-"+a+"s%-"+a+"s%-"+a+"s%n", "ReleaseNumber", z = GetReleaseNumber() , GetMeanReleaseNumber()));   
        return f.toString();
    }
    public String GetMeanReleaseNumber(){
        String meaning = z;
        return meaning;
    }
    
    public String GetStatus(){
        j=i;
        i=i+3;
        return m.substring(j, i);
    }
    public String ToStringStatus(){
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-"+a+"s%-"+a+"s%-"+a+"s%n", "If Regrected", z=GetStatus(), GetMeanStatus()));   
        return f.toString();
    }
    public String GetMeanStatus(){
        return switch (z) {
            case "196" -> "Generic key synchronization error";
            case "199" -> "Security device failure";
            case "210" -> "MSG key synchronization error";
            case "211" -> "invalid MSG error";
            case "220" -> "MAC key synchronization error";
            case "221" -> "invalid MAC error";
            case "230" -> "PIN key synchronization error";
            case "231" -> "Invalid PIN error";
            case "350" -> "ALternate Routed";
            case "360" -> "Log only";
            case "361" -> "Log only acknowledgement";
            default -> "Invalid Status";
        };
    }
    
//ici    
    
    public String GetOriginatorCode(){
        j=i;
        i=i+1;
        return m.substring(j, i);
    }
    public String ToStringOriginatorCode(){
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-"+a+"s%-"+a+"s%-"+a+"s%n", "Originator Code", GetOriginatorCode(), GetMeanOriginatorCode()));   
        return f.toString();
    }
    public String GetMeanOriginatorCode(){
        String meaning = "IfStatement";
        return meaning;
    }   
    
    public String GetResponderCode(){
        j=i;
        i=i+1;
        return m.substring(j, i);
    }
    public String ToStringResponderCode(){
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-"+a+"s%-"+a+"s%-"+a+"s%n", "Responder Code", GetResponderCode(), GetMeanResponderCode()));   
        return f.toString();
    }
    public String GetMeanResponderCode(){
        String meaning = "IfStatement";
        return meaning;
    }   
    
    public String GetMti(){
        j=i;
        i=i+4;
        return m.substring(j, i);
    }
    public String ToStringMti(){
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-"+a+"s%-"+a+"s%-"+a+"s%n", "MTI", GetMti(), GetMeanMti()));   
        return f.toString();
    }
    public String GetMeanMti(){
        String meaning = "IfStatement";
        return meaning;
    }

    public String GetPrimaryBit(){
        j=i;
        i=i+16;
        return m.substring(j, i);
    }
    
    public String ToStringPrimaryBit(String PB){
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-"+a+"s%-"+a+"s%-"+a+"s%n", "Primary Bit Map", PB, ""));   
        return f.toString();
    }
    
    public String GetWhatIsP1() {
        return "1. Secondary Bit Map";
    }

    public String GetP1() {
        j=i;
        i=i+16;
        return m.substring(j, i);
    }

    public String ToStringP1() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-"+a+"s%-"+a+"s%-"+a+"s%n",GetWhatIsP1() , GetP1(), ""));   
        return f.toString();
    }

    public String GetWhatIsP2() {
        return "2. Primary Account Number";
    }

    public String GetP2() {
        int l = 2; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP2() {
        String meaning = "IfStatement";
        return meaning;
    }   

    public String ToStringP2() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP2(), GetP2(), GetMeanP2()));   
        return f.toString();
    }

    public String GetWhatIsP3() {
        return "3. Processing Code";
    }

    public String GetP3() {
        j=i;
        i=i+6;
        return m.substring(j, i);
    }

    public String GetMeanP3() {
        String meaning = "IfStatement";
        return meaning;
    }   

    public String ToStringP3() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP3(), GetP3(), GetMeanP3()));   
        return f.toString();
    }

    public String GetWhatIsP4() {
        return "4. Transaction Amount";
    }

    public String GetP4() {
        j=i;
        i=i+12;
        return m.substring(j, i);
    }

    public String GetMeanP4() {
        String meaning = "IfStatement";
        return meaning;
    }   

    public String ToStringP4() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP4(), GetP4(), GetMeanP4()));   
        return f.toString();
    }

    public String GetWhatIsP5() {
        return "5. Settlement Amount";
    }

    public String GetP5() {
        j=i;
        i=i+12;
        return m.substring(j, i);
    }

    public String GetMeanP5() {
        String meaning = "IfStatement";
        return meaning;
    }   

    public String ToStringP5() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP5(), GetP5(), GetMeanP5()));   
        return f.toString();
    }

    public String GetWhatIsP6() {
        return "6. Cardholder Billing Amount";
    }

    public String GetP6() {
        j=i;
        i=i+12;
        return m.substring(j, i);
    }

    public String GetMeanP6() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP6() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP6(), GetP6(), GetMeanP6()));   
        return f.toString();
    }
    
    public String GetWhatIsP7() {
        return "7. Transmission Date and Time";
    }

    public String GetP7() {
        j=i;
        i=i+10;
        return m.substring(j, i);
    }

    public String GetMeanP7() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP7() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP7(), GetP7(), GetMeanP7()));   
        return f.toString();
    }
    
    public String GetWhatIsP8() {
    return "8. Amount, Cardholder Billing Fee";
}

    public String GetP8() {
        j=i;
        i=i+8;
        return m.substring(j, i);
    }

    public String GetMeanP8() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP8() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP8(), GetP8(), GetMeanP8()));   
        return f.toString();
    }

    public String GetWhatIsP9() {
        return "9.  Conversion Rate, Settlement";
    }

    public String GetP9() {
        j=i;
        i=i+8;
        return m.substring(j, i);
    }

    public String GetMeanP9() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP9() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP9(), GetP9(), GetMeanP9()));   
        return f.toString();
    }

    public String GetWhatIsP10() {
        return "10. Conversion Rate, Cardholder Billing";
    }

    public String GetP10() {
        j=i;
        i=i+8;
        return m.substring(j, i);
    }

    public String GetMeanP10() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP10() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP10(), GetP10(), GetMeanP10()));   
        return f.toString();
    }

    public String GetWhatIsP11() {
        return "11. System Trace Audit Number";
    }

    public String GetP11() {
        j=i;
        i=i+6;
        return m.substring(j, i);
    }

    public String GetMeanP11() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP11() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP11(), GetP11(), GetMeanP11()));   
        return f.toString();
    }

    public String GetWhatIsP12() {
        return "12. Time, Local Transaction";
    }

    public String GetP12() {
        j=i;
        i=i+6;
        return m.substring(j, i);
    }

    public String GetMeanP12() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP12() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP12(), GetP12(), GetMeanP12()));   
        return f.toString();
    }

    public String GetWhatIsP13() {
        return "13. Date, Local Transaction";
    }

    public String GetP13() {
        j=i;
        i=i+4;
        return m.substring(j, i);
    }

    public String GetMeanP13() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP13() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP13(), GetP13(), GetMeanP13()));   
        return f.toString();
    }

    public String GetWhatIsP14() {
        return "14. Date, Expiration";
    }

    public String GetP14() {
        j=i;
        i=i+4;
        return m.substring(j, i);
    }

    public String GetMeanP14() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP14() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP14(), GetP14(), GetMeanP14()));   
        return f.toString();
    }

    public String GetWhatIsP15() {
        return "15.  Date, Settlement";
    }

    public String GetP15() {
        j=i;
        i=i+4;
        return m.substring(j, i);
    }

    public String GetMeanP15() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP15() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP15(), GetP15(), GetMeanP15()));   
        return f.toString();
    }

    public String GetWhatIsP16() {
        return "16. Date, Conversion";
    }

    public String GetP16() {
        j=i;
        i=i+4;
        return m.substring(j, i);
    }

    public String GetMeanP16() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP16() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP16(), GetP16(), GetMeanP16()));   
        return f.toString();
    }

    public String GetWhatIsP17() {
        return "17.  Date, Capture";
    }

    public String GetP17() {
        j=i;
        i=i+4;
        return m.substring(j, i);
    }

    public String GetMeanP17() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP17() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP17(), GetP17(), GetMeanP17()));   
        return f.toString();
    }

    public String GetWhatIsP18() {
        return "18. Merchant Type";
    }

    public String GetP18() {
        j=i;
        i=i+4;
        return m.substring(j, i);  
    }

    public String GetMeanP18() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP18() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP18(), GetP18(), GetMeanP18()));   
        return f.toString();
    }

    public String GetWhatIsP19() {
        return "19. Acquiring Institution Country Code";
    }

    public String GetP19() {
        j=i;
        i=i+3;
        return m.substring(j, i);
    }

    public String GetMeanP19() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP19() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP19(), GetP19(), GetMeanP19()));   
        return f.toString();
    }

    public String GetWhatIsP20() {
        return "20. Pan Country Code";
    }

    public String GetP20() {
        j=i;
        i=i+3;
        return m.substring(j, i);
    }

    public String GetMeanP20() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP20() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP20(), GetP20(), GetMeanP20()));   
        return f.toString();
    }

    public String GetWhatIsP21() {
        return "21.  Forwarding Institution Country Code";
    }

    public String GetP21() {
        j=i;
        i=i+3;
        return m.substring(j, i);
    }

    public String GetMeanP21() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP21() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP21(), GetP21(), GetMeanP21()));   
        return f.toString();
    }

    public String GetWhatIsP22() {
        return "22. Point Of Service Entry Mode";
    }

    public String GetP22() {
        j=i;
        i=i+3;
        return m.substring(j, i);
    }

    public String GetMeanP22() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP22() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP22(), GetP22(), GetMeanP22()));   
        return f.toString();
    }

    public String GetWhatIsP23() {
        return "23. Card Sequence Number";
    }

    public String GetP23() {
        j=i;
        i=i+3;
        return m.substring(j, i);
    }

    public String GetMeanP23() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP23() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP23(), GetP23(), GetMeanP23()));   
        return f.toString();
    }

    public String GetWhatIsP24() {
        return "24. Network International Identifier ";
    }

    public String GetP24() {
        j=i;
        i=i+3;
        return m.substring(j, i);
    }

    public String GetMeanP24() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP24() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP24(), GetP24(), GetMeanP24()));   
        return f.toString();
    }

    public String GetWhatIsP25() {
        return "25. Point of Service Condition Code";
    }

    public String GetP25() {
        j=i;
        i=i+2;
        return m.substring(j, i);
    }

    public String GetMeanP25() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP25() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP25(), GetP25(), GetMeanP25()));   
        return f.toString();
    }

    public String GetWhatIsP26() {
        return "26. Point of Service PIN Capture Code";
    }

    public String GetP26() {
        j=i;
        i=i+2;
        return m.substring(j, i);
    }

    public String GetMeanP26() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP26() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP26(), GetP26(), GetMeanP26()));   
        return f.toString();
    }

    public String GetWhatIsP27() {
        return "27.  Authorization Identification Response Length";
    }

    public String GetP27() {
        j=i;
        i=i+1;
        return m.substring(j, i);
    }

    public String GetMeanP27() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP27() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP27(), GetP27(), GetMeanP27()));   
        return f.toString();
    }

    public String GetWhatIsP28() {
        return "28. Amount, Transaction Fee";
    }

    public String GetP28() {
        j=i;
        i=i+8;
        return m.substring(j, i);
    }

    public String GetMeanP28() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP28() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP28(), GetP28(), GetMeanP28()));   
        return f.toString();
    }

    public String GetWhatIsP29() {
        return "29. Amount, Settlement Fee";
    }

    public String GetP29() {
        j=i;
        i=i+8;
        return m.substring(j, i);
    }

    public String GetMeanP29() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP29() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP29(), GetP29(), GetMeanP29()));   
        return f.toString();
    }

    public String GetWhatIsP30() {
        return "30. Amount, Transaction Processing Fee";
    }

    public String GetP30() {
        j=i;
        i=i+8;
        return m.substring(j, i);
    }

    public String GetMeanP30() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP30() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP30(), GetP30(), GetMeanP30()));   
        return f.toString();
    }

    public String GetWhatIsP31() {
        return "31. Amount, Settlement Processing Fee";
    }

    public String GetP31() {
        j=i;
        i=i+8;
        return m.substring(j, i);
    }

    public String GetMeanP31() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP31() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP31(), GetP31(), GetMeanP31()));   
        return f.toString();
    }

    public String GetWhatIsP32() {
        return "32.  Acquiring Institution Identification Code";
    }

    public String GetP32() {   
        int l = 2; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP32() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP32() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP32(), GetP32(), GetMeanP32()));   
        return f.toString();
    }

    public String GetWhatIsP33() {
        return "33.  Forwarding Institution Identification Code";
    }

    public String GetP33() {
        int l = 2; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP33() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP33() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP33(), GetP33(), GetMeanP33()));   
        return f.toString();
    }

    public String GetWhatIsP34() {
        return "34. Primary Account Number, Extended";
    }

    public String GetP34() {
        int l = 2; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP34() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP34() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP34(), GetP34(), GetMeanP34()));   
        return f.toString();
    }

    public String GetWhatIsP35() {
        return "35. Track-2 Data";
    }

    public String GetP35() {
        int l = 2; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP35() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP35() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP35(), GetP35(), GetMeanP35()));   
        return f.toString();
    }

    public String GetWhatIsP36() {
        return "36.  Track-3 Data";
    }

    public String GetP36() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP36() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP36() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP36(), GetP36(), GetMeanP36()));   
        return f.toString();
    }

    public String GetWhatIsP37() {
        return "37. Retrieval Reference Number";
    }

    public String GetP37() {
        j=i;
        i=i+12;
        return m.substring(j, i);
    }

    public String GetMeanP37() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP37() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP37(), GetP37(), GetMeanP37()));   
        return f.toString();
    }

    public String GetWhatIsP38() {
        return "38. Authorization Identification Response";
    }

    public String GetP38() {
        j=i;
        i=i+6;
        return m.substring(j, i);    }

    public String GetMeanP38() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP38() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP38(), GetP38(), GetMeanP38()));   
        return f.toString();
    }

    public String GetWhatIsP39() {
        return "39.  Response Code";
    }

    public String GetP39() {
        j=i;
        i=i+2;
        return m.substring(j, i);
    }

    public String GetMeanP39() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP39() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP39(), GetP39(), GetMeanP39()));   
        return f.toString();
    }

    public String GetWhatIsP40() {
        return "40.  Service Restriction Code";
    }

    public String GetP40() {
        j=i;
        i=i+3;
        return m.substring(j, i);
    }

    public String GetMeanP40() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP40() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP40(), GetP40(), GetMeanP40()));   
        return f.toString();
    }

    public String GetWhatIsP41() {
        return "41.  Card Acceptor Terminal Identification";
    }

    public String GetP41() {
        j=i;
        i=i+16;
        return m.substring(j, i);
    }

    public String GetMeanP41() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP41() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP41(), GetP41(), GetMeanP41()));   
        return f.toString();
    }

    public String GetWhatIsP42() {
        return "42. Card Acceptor Identification Code";
    }

    public String GetP42() {
        j=i;
        i=i+15;
        return m.substring(j, i);
    }

    public String GetMeanP42() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP42() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP42(), GetP42(), GetMeanP42()));   
        return f.toString();
    }

    public String GetWhatIsP43() {
        return "43.  Card Acceptor Name/Location";
    }

    public String GetP43() {
        j=i;
        i=i+40;
        return m.substring(j, i);
    }

    public String GetMeanP43() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP43() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP43(), GetP43(), GetMeanP43()));   
        return f.toString();
    }

    public String GetWhatIsP44() {
        return "44.  Additional Response Data";
    }

    public String GetP44() {
        int l = 2; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP44() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP44() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP44(), GetP44(), GetMeanP44()));   
        return f.toString();
    }

    public String GetWhatIsP45() {
        return "45. Track-1 Data";
    }

    public String GetP45() {
        int l = 2; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP45() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP45() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP45(), GetP45(), GetMeanP45()));   
        return f.toString();
    }

    public String GetWhatIsP46() {
        return "46. Additional Data (ISO) ";
    }

    public String GetP46() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP46() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP46() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP46(), GetP46(), GetMeanP46()));   
        return f.toString();
    }

    public String GetWhatIsP47() {
        return "47. Additional Data (National) ";
    }

    public String GetP47() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP47() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP47() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP47(), GetP47(), GetMeanP47()));   
        return f.toString();
    }

    public String GetWhatIsP48() {
        return "48. Additional Data (Private/ISO 8583–1987)";
    }

    public String GetP48() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP48() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP48() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP48(), GetP48(), GetMeanP48()));   
        return f.toString();
    }

    public String GetWhatIsP49() {
        return "49. Currency Code, Transaction";
    }

    public String GetP49() {
        j=i;
        i=i+3;
        return m.substring(j, i);
    }

    public String GetMeanP49() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP49() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP49(), GetP49(), GetMeanP49()));   
        return f.toString();
    }

    public String GetWhatIsP50() {
        return "50. Currency Code, Settlement";
    }

    public String GetP50() {
        j=i;
        i=i+3;
        return m.substring(j, i);
    }

    public String GetMeanP50() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP50() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP50(), GetP50(), GetMeanP50()));   
        return f.toString();
    }

    public String GetWhatIsP51() {
        return "51. Currency Code, Cardholder Billing";
    }

    public String GetP51() {
        j=i;
        i=i+3;
        return m.substring(j, i);
    }

    public String GetMeanP51() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP51() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP51(), GetP51(), GetMeanP51()));   
        return f.toString();
    }

    public String GetWhatIsP52() {
        return "52. Personal Identification Number (PIN) Data";
    }

    public String GetP52() {
        j=i;
        i=i+16;
        return m.substring(j, i);
    }

    public String GetMeanP52() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP52() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP52(), GetP52(), GetMeanP52()));   
        return f.toString();
    }

    public String GetWhatIsP53() {
        return "53.  Security Related Control Information";
    }

    public String GetP53() {
        j=i;
        i=i+16;
        return m.substring(j, i);
    }

    public String GetMeanP53() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP53() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP53(), GetP53(), GetMeanP53()));   
        return f.toString();
    }

    public String GetWhatIsP54() {
        return "54.  Additional Amounts";
    }

    public String GetP54() {
       int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP54() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP54() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP54(), GetP54(), GetMeanP54()));   
        return f.toString();
    }

    public String GetWhatIsP55() {
        return "55. Integrated Circuit Card";
    }

    public String GetP55() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP55() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP55() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP55(), GetP55(), GetMeanP55()));   
        return f.toString();
    }

    public String GetWhatIsP56() {
        return "56.  Reserved (ISO)";
    }

    public String GetP56() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP56() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP56() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP56(), GetP56(), GetMeanP56()));   
        return f.toString();
    }

    public String GetWhatIsP57() {
        return "57. ";
    }

    public String GetP57() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP57() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP57() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP57(), GetP57(), GetMeanP57()));   
        return f.toString();
    }

    public String GetWhatIsP58() {
        return "58. ";
    }

    public String GetP58() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP58() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP58() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP58(), GetP58(), GetMeanP58()));   
        return f.toString();
    }

    public String GetWhatIsP59() {
        return "59. Transport Data";
    }

    public String GetP59() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP59() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP59() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP59(), GetP59(), GetMeanP59()));   
        return f.toString();
    }

    public String GetWhatIsP60() {
        return "60. Advice Reason Code";
    }

    public String GetP60() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP60() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP60() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP60(), GetP60(), GetMeanP60()));   
        return f.toString();
    }

    public String GetWhatIsP61() {
        return "61. 1 POS. Data";
    }

    public String GetP61() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP61() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP61() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP61(), GetP61(), GetMeanP61()));   
        return f.toString();
    }

    public String GetWhatIsP62() {
        return "62. Intermediate Network Facility (INF) Data";
    }

    public String GetP62() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP62() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP62() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP62(), GetP62(), GetMeanP62()));   
        return f.toString();
    }

    public String GetWhatIsP63() {
        return "63. Network Data";
    }

    public String GetP63() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP63() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP63() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP63(), GetP63(), GetMeanP63()));   
        return f.toString();
    }

    public String GetWhatIsP64() {
        return "64. Message Authentication Code (MAC)";
    }

    public String GetP64() {
        j=i;
        i=i+16;
        return m.substring(j, i);
    }

    public String GetMeanP64() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP64() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP64(), GetP64(), GetMeanP64()));   
        return f.toString();
    }

    public String GetWhatIsP65() {
        return "65.  Bit map, Extended ";
    }

    public String GetP65() {
        j=i;
        i=i+16;
        return m.substring(j, i);
    }

    public String GetMeanP65() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP65() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP65(), GetP65(), GetMeanP65()));   
        return f.toString();
    }

    public String GetWhatIsP66() {
        return "66.  Settlement Code";
    }

    public String GetP66() {
        j=i;
        i=i+1;
        return m.substring(j, i);
    }

    public String GetMeanP66() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP66() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP66(), GetP66(), GetMeanP66()));   
        return f.toString();
    }

    public String GetWhatIsP67() {
        return "67.  Extended Payment Code";
    }

    public String GetP67() {
        j=i;
        i=i+2;
        return m.substring(j, i);
    }

    public String GetMeanP67() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP67() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP67(), GetP67(), GetMeanP67()));   
        return f.toString();
    }

    public String GetWhatIsP68() {
        return "68.Receiving Institution Country Code ";
    }

    public String GetP68() {
        j=i;
        i=i+3;
        return m.substring(j, i);
    }

    public String GetMeanP68() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP68() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP68(), GetP68(), GetMeanP68()));   
        return f.toString();
    }

    public String GetWhatIsP69() {
        return "69. Settlement Institution Country Code";
    }

    public String GetP69() {
        j=i;
        i=i+3;
        return m.substring(j, i);
    }

    public String GetMeanP69() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP69() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP69(), GetP69(), GetMeanP69()));   
        return f.toString();
    }

    public String GetWhatIsP70() {
        return "70. Network Management Information Code";
    }

    public String GetP70() {
        j=i;
        i=i+3;
        return m.substring(j, i);
    }

    public String GetMeanP70() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP70() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP70(), GetP70(), GetMeanP70()));   
        return f.toString();
    }

    public String GetWhatIsP71() {
        return "71. Message Number ";
    }

    public String GetP71() {
        j=i;
        i=i+4;
        return m.substring(j, i);
    }

    public String GetMeanP71() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP71() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP71(), GetP71(), GetMeanP71()));   
        return f.toString();
    }

    public String GetWhatIsP72() {
        return "72. Message Number Last";
    }

    public String GetP72() {
        j=i;
        i=i+4;
        return m.substring(j, i);
    }

    public String GetMeanP72() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP72() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP72(), GetP72(), GetMeanP72()));   
        return f.toString();
    }

    public String GetWhatIsP73() {
        return "73. Date, Action ";
    }

    public String GetP73() {
        j=i;
        i=i+6;
        return m.substring(j, i);
    }

    public String GetMeanP73() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP73() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP73(), GetP73(), GetMeanP73()));   
        return f.toString();
    }

    public String GetWhatIsP74() {
        return "74.  Credits, Number";
    }

    public String GetP74() {
        j=i;
        i=i+10;
        return m.substring(j, i);
    }

    public String GetMeanP74() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP74() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP74(), GetP74(), GetMeanP74()));   
        return f.toString();
    }

    public String GetWhatIsP75() {
        return "75.  Credits, Reversal Number";
    }

    public String GetP75() {
        j=i;
        i=i+10;
        return m.substring(j, i);
    }

    public String GetMeanP75() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP75() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP75(), GetP75(), GetMeanP75()));   
        return f.toString();
    }

    public String GetWhatIsP76() {
        return "76. Debits, Number";
    }

    public String GetP76() {
        j=i;
        i=i+10;
        return m.substring(j, i);
    }

    public String GetMeanP76() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP76() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP76(), GetP76(), GetMeanP76()));   
        return f.toString();
    }

    public String GetWhatIsP77() {
        return "77.  Debits, Reversal Number";
    }

    public String GetP77() {
        j=i;
        i=i+10;
        return m.substring(j, i);
    }

    public String GetMeanP77() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP77() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP77(), GetP77(), GetMeanP77()));   
        return f.toString();
    }

    public String GetWhatIsP78() {
        return "78. Transfers, Number";
    }

    public String GetP78() {
        j=i;
        i=i+10;
        return m.substring(j, i);
    }

    public String GetMeanP78() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP78() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP78(), GetP78(), GetMeanP78()));   
        return f.toString();
    }

    public String GetWhatIsP79() {
        return "79.  Transfers, Reversal Number";
    }

    public String GetP79() {
        j=i;
        i=i+10;
        return m.substring(j, i);
    }

    public String GetMeanP79() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP79() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP79(), GetP79(), GetMeanP79()));   
        return f.toString();
    }

    public String GetWhatIsP80() {
        return "80.  Inquiries, Number";
    }

    public String GetP80() {
        j=i;
        i=i+10;
        return m.substring(j, i);
    }

    public String GetMeanP80() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP80() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP80(), GetP80(), GetMeanP80()));   
        return f.toString();
    }

    public String GetWhatIsP81() {
        return "81.  Authorizations, Number";
    }

    public String GetP81() {
        j=i;
        i=i+10;
        return m.substring(j, i);
    }

    public String GetMeanP81() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP81() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP81(), GetP81(), GetMeanP81()));   
        return f.toString();
    }

    public String GetWhatIsP82() {
        return "82.  Credits, Processing Fee Amount";
    }

    public String GetP82() {
        j=i;
        i=i+12;
        return m.substring(j, i);
    }

    public String GetMeanP82() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP82() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP82(), GetP82(), GetMeanP82()));   
        return f.toString();
    }

    public String GetWhatIsP83() {
        return "83. Credits, Transaction Fee Amount";
    }

    public String GetP83() {
        j=i;
        i=i+12;
        return m.substring(j, i);
    }

    public String GetMeanP83() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP83() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP83(), GetP83(), GetMeanP83()));   
        return f.toString();
    }

    public String GetWhatIsP84() {
        return "84. Debits, Processing Fee Amount";
    }

    public String GetP84() {
        j=i;
        i=i+12;
        return m.substring(j, i);
    }

    public String GetMeanP84() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP84() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP84(), GetP84(), GetMeanP84()));   
        return f.toString();
    }

    public String GetWhatIsP85() {
        return "85.  Debits, Transaction Fee Amount";
    }

    public String GetP85() {
        j=i;
        i=i+12;
        return m.substring(j, i);
    }

    public String GetMeanP85() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP85() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP85(), GetP85(), GetMeanP85()));   
        return f.toString();
    }

    public String GetWhatIsP86() {
        return "86.  Credits, Amount";
    }

    public String GetP86() {
        j=i;
        i=i+16;
        return m.substring(j, i);
    }

    public String GetMeanP86() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP86() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP86(), GetP86(), GetMeanP86()));   
        return f.toString();
    }

    public String GetWhatIsP87() {
        return "87.  Credits, Reversal Amount";
    }

    public String GetP87() {
         j=i;
        i=i+16;
        return m.substring(j, i);
    }

    public String GetMeanP87() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP87() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP87(), GetP87(), GetMeanP87()));   
        return f.toString();
    }

    public String GetWhatIsP88() {
        return "88. Debits, Amount";
    }

    public String GetP88() {
         j=i;
        i=i+16;
        return m.substring(j, i);
    }

    public String GetMeanP88() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP88() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP88(), GetP88(), GetMeanP88()));   
        return f.toString();
    }

    public String GetWhatIsP89() {
        return "89. Debits, Reversal Amount";
    }

    public String GetP89() {
         j=i;
        i=i+16;
        return m.substring(j, i);
    }

    public String GetMeanP89() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP89() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP89(), GetP89(), GetMeanP89()));   
        return f.toString();
    }

    public String GetWhatIsP90() {
        return "90. Original Data Elements";
    }

    public String GetP90() {
         j=i;
        i=i+42;
        return m.substring(j, i);
    }

    public String GetMeanP90() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP90() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP90(), GetP90(), GetMeanP90()));   
        return f.toString();
    }

    public String GetWhatIsP91() {
        return "91. File Update Code";
    }

    public String GetP91() {
        j=i;
        i=i+1;
        return m.substring(j, i);
    }

    public String GetMeanP91() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP91() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP91(), GetP91(), GetMeanP91()));   
        return f.toString();
    }

    public String GetWhatIsP92() {
        return "92. File Security Code";
    }

    public String GetP92() {
        j=i;
        i=i+2;
        return m.substring(j, i);
    }

    public String GetMeanP92() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP92() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP92(), GetP92(), GetMeanP92()));   
        return f.toString();
    }

    public String GetWhatIsP93() {
        return "93.  Response Indicator ";
    }

    public String GetP93() {
        j=i;
        i=i+5;
        return m.substring(j, i);
    }

    public String GetMeanP93() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP93() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP93(), GetP93(), GetMeanP93()));   
        return f.toString();
    }

    public String GetWhatIsP94() {
        return "94.  Service Indicator";
    }

    public String GetP94() {
        j=i;
        i=i+7;
        return m.substring(j, i);
    }

    public String GetMeanP94() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP94() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP94(), GetP94(), GetMeanP94()));   
        return f.toString();
    }

    public String GetWhatIsP95() {
        return "95.  Replacement Amount";
    }

    public String GetP95() {
         j=i;
        i=i+42;
        return m.substring(j, i);
    }

    public String GetMeanP95() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP95() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP95(), GetP95(), GetMeanP95()));   
        return f.toString();
    }

    public String GetWhatIsP96() {
        return "96.  Message Security Code";
    }

    public String GetP96() {
         j=i;
        i=i+16;
        return m.substring(j, i);
    }

    public String GetMeanP96() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP96() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP96(), GetP96(), GetMeanP96()));   
        return f.toString();
    }

    public String GetWhatIsP97() {
        return "97. Amount, Net Settlement";
    }

    public String GetP97() {
        return m.substring(96, 97);
    }

    public String GetMeanP97() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP97() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP97(), GetP97(), GetMeanP97()));   
        return f.toString();
    }

    public String GetWhatIsP98() {
        return "98.  Payee";
    }

    public String GetP98() {
         j=i;
        i=i+25;
        return m.substring(j, i);
    }

    public String GetMeanP98() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP98() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP98(), GetP98(), GetMeanP98()));   
        return f.toString();
    }

    public String GetWhatIsP99() {
        return "99.  Settlement Institution Identification Code";
    }

    public String GetP99() {
        int l = 2; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP99() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP99() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP99(), GetP99(), GetMeanP99()));   
        return f.toString();
    }

    public String GetWhatIsP100() {
        return "100.  Receiving Institution Identification Code";
    }

    public String GetP100() {
        int l = 2; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP100() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP100() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP100(), GetP100(), GetMeanP100()));   
        return f.toString();
    }

    public String GetWhatIsP101() {
        return "101.  File Name";
    }

    public String GetP101() {
        int l = 2; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP101() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP101() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP101(), GetP101(), GetMeanP101()));   
        return f.toString();
    }

    public String GetWhatIsP102() {
        return "102. Account Identification-1";
    }

    public String GetP102() {
        int l = 2; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP102() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP102() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP102(), GetP102(), GetMeanP102()));   
        return f.toString();
    }

    public String GetWhatIsP103() {
        return "103.  Account Identification-2";
    }

    public String GetP103() {
        int l = 2; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP103() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP103() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP103(), GetP103(), GetMeanP103()));   
        return f.toString();
    }

    public String GetWhatIsP104() {
        return "104. Transaction Description";
    }

    public String GetP104() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP104() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP104() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP104(), GetP104(), GetMeanP104()));   
        return f.toString();
    }

    public String GetWhatIsP105() {
        return "105. ";
    }

    public String GetP105() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP105() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP105() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP105(), GetP105(), GetMeanP105()));   
        return f.toString();
    }

    public String GetWhatIsP106() {
        return "106. ";
    }

    public String GetP106() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP106() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP106() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP106(), GetP106(), GetMeanP106()));   
        return f.toString();
    }

    public String GetWhatIsP107() {
        return "107. ";
    }

    public String GetP107() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP107() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP107() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP107(), GetP107(), GetMeanP107()));   
        return f.toString();
    }

    public String GetWhatIsP108() {
        return "108. ";
    }

    public String GetP108() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP108() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP108() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP108(), GetP108(), GetMeanP108()));   
        return f.toString();
    }

    public String GetWhatIsP109() {
        return "109. ";
    }

    public String GetP109() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP109() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP109() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP109(), GetP109(), GetMeanP109()));   
        return f.toString();
    }

    public String GetWhatIsP110() {
        return "110. ";
    }

    public String GetP110() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP110() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP110() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP110(), GetP110(), GetMeanP110()));   
        return f.toString();
    }

    public String GetWhatIsP111() {
        return "111. ";
    }

    public String GetP111() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP111() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP111() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP111(), GetP111(), GetMeanP111()));   
        return f.toString();
    }

    public String GetWhatIsP112() {
        return "112.  Parcelas Data";
    }

    public String GetP112() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP112() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP112() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP112(), GetP112(), GetMeanP112()));   
        return f.toString();
    }

    public String GetWhatIsP113() {
        return "113. ";
    }

    public String GetP113() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP113() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP113() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP113(), GetP113(), GetMeanP113()));   
        return f.toString();
    }

    public String GetWhatIsP114() {
        return "114. ";
    }

    public String GetP114() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP114() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP114() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP114(), GetP114(), GetMeanP114()));   
        return f.toString();
    }

    public String GetWhatIsP115() {
        return "115. ";
    }

    public String GetP115() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP115() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP115() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP115(), GetP115(), GetMeanP115()));   
        return f.toString();
    }

    public String GetWhatIsP116() {
        return "116. ";
    }

    public String GetP116() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP116() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP116() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP116(), GetP116(), GetMeanP116()));   
        return f.toString();
    }

    public String GetWhatIsP117() {
        return "117. ";
    }

    public String GetP117() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP117() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP117() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP117(), GetP117(), GetMeanP117()));   
        return f.toString();
    }

    public String GetWhatIsP118() {
        return "118. Intracountry Data";
    }

    public String GetP118() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP118() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP118() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP118(), GetP118(), GetMeanP118()));   
        return f.toString();
    }

    public String GetWhatIsP119() {
        return "119. ";
    }

    public String GetP119() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP119() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP119() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP119(), GetP119(), GetMeanP119()));   
        return f.toString();
    }

    public String GetWhatIsP120() {
        return "120. Record Data";
    }

    public String GetP120() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP120() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP120() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP120(), GetP120(), GetMeanP120()));   
        return f.toString();
    }

    public String GetWhatIsP121() {
        return "121. Authorizing Agent Identification Code";
    }

    public String GetP121() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP121() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP121() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP121(), GetP121(), GetMeanP121()));   
        return f.toString();
    }

    public String GetWhatIsP122() {
        return "122.  Additional Record Data";
    }

    public String GetP122() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP122() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP122() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP122(), GetP122(), GetMeanP122()));   
        return f.toString();
    }

    public String GetWhatIsP123() {
        return "123. ";
    }

    public String GetP123() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP123() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP123() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP123(), GetP123(), GetMeanP123()));   
        return f.toString();
    }

    public String GetWhatIsP124() {
        return "124. ";
    }

    public String GetP124() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP124() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP124() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP124(), GetP124(), GetMeanP124()));   
        return f.toString();
    }

    public String GetWhatIsP125() {
        return "125. ";
    }

    public String GetP125() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP125() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP125() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP125(), GetP125(), GetMeanP125()));   
        return f.toString();
    }

    public String GetWhatIsP126() {
        return "126. Vector Selección de Cuenta OAR";
    }

    public String GetP126() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP126() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP126() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP126(), GetP126(), GetMeanP126()));   
        return f.toString();
    }

    public String GetWhatIsP127() {
        return "127. Datos del Bloqueo ";
    }

    public String GetP127() {
        int l = 3; //number of positions in the variable-length
        String prefix = m.substring(i, i+l);
        j = i+ l ;
        i = i+ l + Integer.parseInt(prefix);
        return Integer.valueOf(prefix) + "" + m.substring(j, j + Integer.parseInt(prefix));
    }

    public String GetMeanP127() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP127() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP127(), GetP127(), GetMeanP127()));   
        return f.toString();
    }

    public String GetWhatIsP128() {
        return "128. Message Authentication Code";
    }

    public String GetP128() {
        j=i;
        i=i+16;
        return m.substring(j, i);
    }

    public String GetMeanP128() {
        String meaning = "";
        return meaning;
    }   

    public String ToStringP128() {       
        StringBuilder f = new StringBuilder();
        f.append(String.format("%-" + a + "s%-" + a + "s%-" + a + "s%n", GetWhatIsP128(), GetP128(), GetMeanP128()));   
        return f.toString();
    }

   


    }
