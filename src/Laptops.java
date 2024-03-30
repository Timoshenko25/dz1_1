import java.util.Set;

public class Laptops {
    String Names;
    int RAM;
    int RailwayVolume;
    String   Os;
    int Processor;
    public Laptops(String Names,int RAM,int RailwayVolume,String Os,int Processor){
        this.Names=Names;
        this.RAM = RAM;
        this.RailwayVolume = RailwayVolume;
        this.Os=Os;
        this.Processor = Processor;
    }
    public String getNames(){
        return Names;
    }
    public int getRAM(){
        return RAM;
    }
    public int getRailwayVolume(){
        return RailwayVolume;
    }
    public String getOs(){
        return Os;
    }
    public int getProcessor(){
        return Processor;
    }
    @Override
    public String toString(){
        return "Names" +Names+"/n"+
                "Озу"+RAM+"/n"+
                "Объём"+RailwayVolume+"/n"+
                "Опеационная система"+Os+"/n"+
                "Процессор"+Processor;
    }
}

