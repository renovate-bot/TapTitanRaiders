package Main;

import Main.Information.CardInfo;
import Main.Information.InfoLoader;
import Main.Information.TitanInfo;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int exitCode = mainFunctionality(args);
        System.exit(exitCode);
    }

    private static int mainFunctionality(String[] args) {
        InfoLoader infoLoader = new InfoLoader();
        List<CardInfo> cardInfoList = infoLoader.loadCardsInfo();
        List<TitanInfo> titanInfoList = infoLoader.loadTitanInfo();
        

        return 0;
    }
}
