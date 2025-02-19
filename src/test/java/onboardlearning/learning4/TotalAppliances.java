package onboardlearning.learning4;

public class TotalAppliances {
   private int fanUnit;
    private int lightUnit;
    private int televisionUnit;
    private int laptopUnit;

    public TotalAppliances(int fanUnit, int lightUnit, int televisionUnit, int laptopUnit) {
        this.fanUnit = fanUnit;
        this.lightUnit = lightUnit;
        this.televisionUnit = televisionUnit;
        this.laptopUnit = laptopUnit;
    }
    public TotalAppliances() {}

    public int getFan(){
         return fanUnit;
     }
     public int getLight(){
         return lightUnit;
     }
    public int getTelevision(){
        return televisionUnit;
    }
    public int getLaptop(){
        return laptopUnit;
    }
    public void setFan(int fanUnit){
        this.fanUnit=fanUnit;
    }
    public void setLight(int lightUnit){
       this.lightUnit=lightUnit;
    }
    public void setTelevision(int televisionUnit){
        this.televisionUnit=televisionUnit;
    }
    public void setLaptop(int laptopUnit){
        this.laptopUnit=laptopUnit;
    }


}
