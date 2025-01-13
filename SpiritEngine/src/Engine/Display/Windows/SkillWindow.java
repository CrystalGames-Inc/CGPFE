package Engine.Display.Windows;

import Engine.Management.PlayerDataMgr;

import javax.swing.*;
import java.awt.*;

public class SkillWindow extends JFrame{

    JTextArea jt = new JTextArea(100,1);

    public void newWindow(){
        PlayerDataMgr pDataMgr = PlayerDataMgr.getInstance();
        JPanel p = new JPanel();

        jt.setText("");
        jt.append("|Player Info:" + "\n");
        jt.append("| Name      : " + pDataMgr.player.info.name + "\n");
        jt.append("| Gender    : " + pDataMgr.player.info.gender + "\n");
        jt.append("| Alignment : " + pDataMgr.player.info.alignment + "\n");
        jt.append("| Age       : " + pDataMgr.player.info.age + "\n");
        jt.append("| Race      : " + pDataMgr.player.info.race + "\n");
        jt.append("| Class     : " + pDataMgr.player.info.pClass + "\n");
        jt.append("| Level     : " + pDataMgr.player.info.level + "\n");
        jt.append("| XP        : " + pDataMgr.player.info.xp + "\n");
        jt.append("| Health    : " + pDataMgr.player.info.health + "\n");
        jt.append("| Max Health: " + pDataMgr.player.info.maxHealth + "\n");

        jt.append("| Skills    :\n");
        for (int i = 0; i < pDataMgr.player.info.skills.length; i++)
            jt.append("|  " + pDataMgr.player.info.skills[i].getName() + "\n");

        jt.append("| Attributes \n");
        jt.append("|  Strength    : " + pDataMgr.player.attributes.Strength + "\n");
        jt.append("|  Dexterity   : " + pDataMgr.player.attributes.Dexterity + "\n");
        jt.append("|  Constitution: " + pDataMgr.player.attributes.Constitution + "\n");
        jt.append("|  Intelligence: " + pDataMgr.player.attributes.Intelligence + "\n");
        jt.append("|  Wisdom      : " + pDataMgr.player.attributes.Wisdom + "\n");
        jt.append("|  Charisma    : " + pDataMgr.player.attributes.Charisma + "\n");
        jt.append("|  Move Speed  : " + pDataMgr.player.attributes.MoveSpeed + "\n");

        jt.append("| Attribute Modifiers \n");
        jt.append("|  Strength    : " + pDataMgr.player.attributeMods.Strength + "\n");
        jt.append("|  Dexterity   : " + pDataMgr.player.attributeMods.Dexterity + "\n");
        jt.append("|  Constitution: " + pDataMgr.player.attributeMods.Constitution + "\n");
        jt.append("|  Intelligence: " + pDataMgr.player.attributeMods.Intelligence + "\n");
        jt.append("|  Wisdom      : " + pDataMgr.player.attributeMods.Wisdom + "\n");
        jt.append("|  Charisma    : " + pDataMgr.player.attributeMods.Charisma + "\n");
        jt.append("|  Move Speed  :" + pDataMgr.player.attributeMods.MoveSpeed + "\n");

        jt.append("| Wallet:\n");
        jt.append("|  Copper Pieces  :" + pDataMgr.player.wallet.CopperPieces + "\n");
        jt.append("|  Silver Pieces  :" + pDataMgr.player.wallet.SilverPieces + "\n");
        jt.append("|  Gold Pieces    :" + pDataMgr.player.wallet.GoldPieces + "\n");
        jt.append("|  Platinum Pieces: " + pDataMgr.player.wallet.PlatinumPieces + "\n");

        jt.setBackground(Color.black);
        jt.setForeground(Color.white);
        jt.setEditable(false);

        p.add(jt);

        add(p);

        setSize(175,1440);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setVisible(true);
    }
}
