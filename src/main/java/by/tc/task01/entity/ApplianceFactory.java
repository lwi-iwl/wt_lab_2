package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.ArrayList;

public class ApplianceFactory {

    public Appliance getAppliance(String applianceType, ArrayList<String> infoParameters){
        Appliance appliance;
        switch (applianceType) {
            case  ("ElectricKettle"):
                appliance = getElectricKettle(infoParameters);
                break;
            case ("Laptop"):
                appliance = getLaptop(infoParameters);
                break;
            case ("Oven"):
                appliance = getOven(infoParameters);
                break;
            case("Refrigerator"):
                appliance = getRefrigerator(infoParameters);
                break;
            case("Speakers"):
                appliance =  getSpeakers(infoParameters);
                break;
            case("TabletPC"):
                appliance = getTabletPC(infoParameters);
                break;
            default:
                appliance = getVacuumCleaner(infoParameters);
                break;
        }
        return appliance;
    }

    private ElectricKettleInfo getElectricKettle(ArrayList<String> infoParameters){
        ElectricKettleInfo electricKettleInfo = new ElectricKettleInfo();
        electricKettleInfo.setType(infoParameters.get(0));
        electricKettleInfo.setPrice(Integer.parseInt(infoParameters.get(1)));
        electricKettleInfo.setName(infoParameters.get(2));
        electricKettleInfo.setPowerConsumption(Integer.parseInt(infoParameters.get(3)));
        electricKettleInfo.setWeight(Integer.parseInt(infoParameters.get(4)));
        electricKettleInfo.setCapacity(Integer.parseInt(infoParameters.get(5)));
        electricKettleInfo.setHeight(Float.parseFloat(infoParameters.get(6)));
        electricKettleInfo.setWidth(Float.parseFloat(infoParameters.get(7)));
        return electricKettleInfo;
    }

    private LaptopInfo getLaptop(ArrayList<String> infoParameters){
        LaptopInfo laptopInfo = new LaptopInfo();
        laptopInfo.setType(infoParameters.get(0));
        laptopInfo.setPrice(Integer.parseInt(infoParameters.get(1)));
        laptopInfo.setName(infoParameters.get(2));
        laptopInfo.setBatteryCapacity(Float.parseFloat(infoParameters.get(3)));
        laptopInfo.setOs(infoParameters.get(4));
        laptopInfo.setMemoryRom(Integer.parseInt(infoParameters.get(5)));
        laptopInfo.setSystemMemory(Integer.parseInt(infoParameters.get(6)));
        laptopInfo.setCpu(Float.parseFloat(infoParameters.get(7)));
        laptopInfo.setDisplayInches(Integer.parseInt(infoParameters.get(8)));
        return laptopInfo;
    }

    private OvenInfo getOven(ArrayList<String> infoParameters){
        OvenInfo ovenInfo = new OvenInfo();
        ovenInfo.setType(infoParameters.get(0));
        ovenInfo.setPrice(Integer.parseInt(infoParameters.get(1)));
        ovenInfo.setName(infoParameters.get(2));
        ovenInfo.setPowerConsumption(Integer.parseInt(infoParameters.get(3)));
        ovenInfo.setWeight(Integer.parseInt(infoParameters.get(4)));
        ovenInfo.setCapacity(Integer.parseInt(infoParameters.get(5)));
        ovenInfo.setDepth(Integer.parseInt(infoParameters.get(6)));
        ovenInfo.setHeight(Float.parseFloat(infoParameters.get(7)));
        ovenInfo.setWidth(Float.parseFloat(infoParameters.get(8)));
        return ovenInfo;
    }

    private RefrigeratorInfo getRefrigerator(ArrayList<String> infoParameters){
        RefrigeratorInfo refrigeratorInfo = new RefrigeratorInfo();
        refrigeratorInfo.setType(infoParameters.get(0));
        refrigeratorInfo.setPrice(Integer.parseInt(infoParameters.get(1)));
        refrigeratorInfo.setName(infoParameters.get(2));
        refrigeratorInfo.setPowerConsumption(Integer.parseInt(infoParameters.get(3)));
        refrigeratorInfo.setWeight(Integer.parseInt(infoParameters.get(4)));
        refrigeratorInfo.setFreezerCapacity(Integer.parseInt(infoParameters.get(5)));
        refrigeratorInfo.setOverallCapacity(Float.parseFloat(infoParameters.get(6)));
        refrigeratorInfo.setHeight(Float.parseFloat(infoParameters.get(7)));
        refrigeratorInfo.setWidth(Float.parseFloat(infoParameters.get(8)));
        return refrigeratorInfo;
    }

    private SpeakersInfo getSpeakers(ArrayList<String> infoParameters){
        SpeakersInfo speakersInfo = new SpeakersInfo();
        speakersInfo.setType(infoParameters.get(0));
        speakersInfo.setPrice(Integer.parseInt(infoParameters.get(1)));
        speakersInfo.setName(infoParameters.get(2));
        speakersInfo.setPowerConsumption(Integer.parseInt(infoParameters.get(3)));
        speakersInfo.setNumberOfSpeakers(Integer.parseInt(infoParameters.get(4)));
        speakersInfo.setFrequencyRange(infoParameters.get(5));
        speakersInfo.setCordLength(Integer.parseInt(infoParameters.get(6)));
        return speakersInfo;
    }

    private TabletPCInfo getTabletPC(ArrayList<String> infoParameters){
        TabletPCInfo tabletPCInfo = new TabletPCInfo();
        tabletPCInfo.setType(infoParameters.get(0));
        tabletPCInfo.setPrice(Integer.parseInt(infoParameters.get(1)));
        tabletPCInfo.setName(infoParameters.get(2));
        tabletPCInfo.setBatteryCapacity(Integer.parseInt(infoParameters.get(3)));
        tabletPCInfo.setDisplayInches(Integer.parseInt(infoParameters.get(4)));
        tabletPCInfo.setMemoryRom(Integer.parseInt(infoParameters.get(5)));
        tabletPCInfo.setFlashMemoryCapacity(Integer.parseInt(infoParameters.get(6)));
        tabletPCInfo.setColor(infoParameters.get(7));
        return tabletPCInfo;
    }

    private VacuumCleanerInfo getVacuumCleaner(ArrayList<String> infoParameters){
        VacuumCleanerInfo vacuumCleanerInfo = new VacuumCleanerInfo();
        vacuumCleanerInfo.setType(infoParameters.get(0));
        vacuumCleanerInfo.setPrice(Integer.parseInt(infoParameters.get(1)));
        vacuumCleanerInfo.setName(infoParameters.get(2));
        vacuumCleanerInfo.setPowerConsumption(Integer.parseInt(infoParameters.get(3)));
        vacuumCleanerInfo.setFilterType(infoParameters.get(4));
        vacuumCleanerInfo.setBagType(infoParameters.get(5));
        vacuumCleanerInfo.setWandType(infoParameters.get(6));
        vacuumCleanerInfo.setMotorSpeedRegulation(Integer.parseInt(infoParameters.get(7)));
        vacuumCleanerInfo.setCleaningWidth(Integer.parseInt(infoParameters.get(8)));
        return vacuumCleanerInfo;
    }


}
