package com.chathumina.businessutils;

public class Business {
    private DataService dataService;

    public Business(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int findTheGreatestFromAllData() throws FooException {
        int[] data = dataService.retrieveAllData();
        int greatest = 0;

        for (int value : data) {
            if (value > greatest) {
                greatest = value;
            }
        }

        if(greatest == 0){
            throw new FooException();
        }
        return greatest;
    }
}
