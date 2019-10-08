package Main.Information;

import Utilities.Constants;
import Utilities.Utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

public class InfoLoader {
    public List<CardInfo> loadCardsInfo() {
        List<CardInfo> cards = new LinkedList<>();
        //https://s3.amazonaws.com/tt2-static/info_files/1cb85794dee5ab5ceb475658f00ff6e46a4026d0/RaidSkillInfo.csv
        String file = Utils.getFullPathFromResources("Main/Resources/RaidSkillInfo.csv");
        try (FileReader fr = new FileReader(file);
             BufferedReader reader = new BufferedReader(fr)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] split = line.split(Constants.COMMA);
                CardInfo cardInfo = new CardInfo();
                cardInfo.setCardCardID(split[0]);
                cardInfo.setCardName(split[1]);
                cardInfo.setCardIsActive(split[2]);
                cardInfo.setCardNote(split[3]);
                cardInfo.setCardCategory(split[4]);
                cardInfo.setCardType(split[5]);
                cardInfo.setCardTier(split[6]);
                cardInfo.setCardBestAgainst(split[7]);
                cardInfo.setCardMaxStacks(split[8]);
                cardInfo.setCardDuration(split[9]);
                cardInfo.setCardChance(split[10]);
                cardInfo.setCardSpatialLength(split[11]);
                cardInfo.setCardBaseCooldown(split[12]);
                cardInfo.setCardMaxLevel(split[13]);
                cardInfo.setCardColor(split[14]);
                cardInfo.setCardC1(split[15]);
                cardInfo.setCardC2(split[16]);
                cardInfo.setCardC3(split[17]);
                cardInfo.setCardC4(split[18]);
                cardInfo.setCardC5(split[19]);
                cardInfo.setCardC6(split[20]);
                cardInfo.setCardC7(split[21]);
                cardInfo.setCardC8(split[22]);
                cardInfo.setCardC9(split[23]);
                cardInfo.setCardC10(split[24]);
                cardInfo.setCardC11(split[25]);
                cardInfo.setCardC12(split[26]);
                cardInfo.setCardC13(split[27]);
                cardInfo.setCardU1(split[28]);
                cardInfo.setCardU2(split[29]);
                cardInfo.setCardU3(split[30]);
                cardInfo.setCardU4(split[31]);
                cardInfo.setCardU5(split[32]);
                cardInfo.setCardU6(split[33]);
                cardInfo.setCardU7(split[34]);
                cardInfo.setCardU8(split[35]);
                cardInfo.setCardU9(split[36]);
                cardInfo.setCardU10(split[37]);
                cardInfo.setCardU11(split[38]);
                cardInfo.setCardU12(split[39]);
                cardInfo.setCardU13(split[40]);
                cardInfo.setCardBonusTypeA(split[41]);
                cardInfo.setCardA1(split[42]);
                cardInfo.setCardA2(split[43]);
                cardInfo.setCardA3(split[44]);
                cardInfo.setCardA4(split[45]);
                cardInfo.setCardA5(split[46]);
                cardInfo.setCardA6(split[47]);
                cardInfo.setCardA7(split[48]);
                cardInfo.setCardA8(split[49]);
                cardInfo.setCardA9(split[50]);
                cardInfo.setCardA10(split[51]);
                cardInfo.setCardA11(split[52]);
                cardInfo.setCardA12(split[53]);
                cardInfo.setCardA13(split[54]);
                cardInfo.setCardBonusTypeB(split[55]);
                cardInfo.setCardB1(split[56]);
                cardInfo.setCardB2(split[57]);
                cardInfo.setCardB3(split[58]);
                cardInfo.setCardB4(split[59]);
                cardInfo.setCardB5(split[60]);
                cardInfo.setCardB6(split[61]);
                cardInfo.setCardB7(split[62]);
                cardInfo.setCardB8(split[63]);
                cardInfo.setCardB9(split[64]);
                cardInfo.setCardB10(split[65]);
                cardInfo.setCardB11(split[66]);
                cardInfo.setCardB12(split[67]);
                cardInfo.setCardB13(split[68]);
                cardInfo.setCardBonusTypeC(split[69]);
                cardInfo.setCardBonusAmountC(split[70]);
                cardInfo.setCardBonusTypeD(split[71]);
                cardInfo.setCardBonusAmountD(split[72]);
                cardInfo.setCardBonusTypeE(split[73]);
                cardInfo.setCardBonusAmountE(split[74]);
                cardInfo.setCardBonusTypeF(split[75]);
                cardInfo.setCardBonusAmountF(split[76]);
                cards.add(cardInfo);
            }
        } catch (Exception e) {
            System.out.println("bad file reader at InfoLoader");
        }
        return cards;
    }

    public List<TitanInfo> loadTitanInfo() {
        List<TitanInfo> titanInfos = new LinkedList<>();
        //https://s3.amazonaws.com/tt2-static/info_files/1cb85794dee5ab5ceb475658f00ff6e46a4026d0/RaidSkillInfo.csv
        String file = Utils.getFullPathFromResources("Main/Resources/RaidEnemyInfo.csv");
        try (FileReader fr = new FileReader(file);
             BufferedReader reader = new BufferedReader(fr)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] split = line.split(Constants.COMMA);
                TitanInfo titanInfo = new TitanInfo();
                titanInfo.setTitEnemyID(split[0]);
                titanInfo.setTitName(split[1]);
                titanInfo.setTitColor(split[2]);
                titanInfo.setTitBodyHeadMult(split[3]);
                titanInfo.setTitBodyTorsoMult(split[4]);
                titanInfo.setTitBodyArmsMult(split[5]);
                titanInfo.setTitBodyLegsMult(split[6]);
                titanInfo.setTitArmorHeadMult(split[7]);
                titanInfo.setTitArmorTorsoMult(split[8]);
                titanInfo.setTitArmorArmsMult(split[9]);
                titanInfo.setTitArmorLegsMult(split[10]);
                titanInfo.setTitTotalinArmour(split[11]);
                titanInfo.setTitTotalinBody(split[12]);
                titanInfo.setTitBodyPhysicalMult(split[13]);
                titanInfo.setTitBodyElementalMult(split[14]);
                titanInfo.setTitBodyArmsMult(split[15]);
                titanInfo.setTitArmorPhysicalMult(split[16]);
                titanInfo.setTitArmorElementalMult(split[17]);
                titanInfo.setTitArmorArcaneMult(split[18]);
                titanInfo.setTitHPWeightBody(split[19]);
                titanInfo.setTitHPWeightArmor(split[20]);
                titanInfo.setTitHPWeightHead(split[21]);
                titanInfo.setTitHPWeightChest(split[22]);
                titanInfo.setTitHPWeightArm(split[23]);
                titanInfo.setTitHPWeightLeg(split[24]);
                titanInfo.setTitBonusTypeA(split[25]);
                titanInfo.setTitBonusAmountA(split[26]);
                titanInfo.setTitBonusTypeB(split[27]);
                titanInfo.setTitBonusAmountB(split[28]);
                titanInfo.setTitBonusTypeC(split[29]);
                titanInfo.setTitBonusAmountC(split[30]);
                titanInfo.setTitBonusTypeD(split[31]);
                titanInfo.setTitBonusAmountD(split[32]);
                titanInfo.setTitBonusTypeD(split[33]);
                titanInfo.setTitBonusAmountE(split[34]);

                titanInfos.add(titanInfo);
            }
        } catch (Exception e) {
            System.out.println("bad file reader at InfoLoader");
        }
        return titanInfos;
    }
}

