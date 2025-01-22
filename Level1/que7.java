public class que7 {
    public static void main(String [] args){
        int er=6378;
        double volumeKM=(4/3)*3.14*er*er*er;
        double earthRadiusMiles=6378*10.8;
        double volumeMiles=(4/3)*3.14*earthRadiusMiles*earthRadiusMiles*earthRadiusMiles;
        System.out.println("The volume of earth in cubic kilometers is "+volumeKM+" and cubic miles is "+volumeMiles);
        }    
}
