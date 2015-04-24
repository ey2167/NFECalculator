
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class NFEGui extends JFrame {
	/**
	 * initializing the variables for the Gui
	 */
	private JLabel labelstats;
	
	private JTextField[] textstats = new JTextField[7];
	private JButton[] stathelp = new JButton[7];
	private JButton calc;
	
	NFEGui(){
		/**
		 * calling the FeCalculator class into the new object calculate
		 */
		
		
		labelstats = new JLabel();
		labelstats.setLayout(new GridLayout(8,2));
		/**
		 * having the layout as a grid to allign input text and butttons 
		 */
	
		for(int i=0; i<7; i++){
			textstats[i] = new JTextField("type stat number here");
		}
		
		
		/**
		 * setting up the properties of the help buttons to describe what the stat effects
		 */
		stathelp[0] = new JButton("Strength");
		stathelp[0].addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "1 point of Strength gives + 1 atk");
			 }
		 });
		/**
		 * create textstats in which you input your values of each stat
		 */
		textstats[0] = new JTextField("type Strength here");
		

		
		stathelp[1] = new JButton("Skill");
		stathelp[1].addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "1 point of Skill gives +1 hit, 2 points of skill give +1 crit");
			 }
		 });
		textstats[1] = new JTextField("type Skill here");
			 
		
		stathelp[2] = new JButton("Speed");
		stathelp[2].addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "1 point of Speed gives + 3 avoid (if you have a +4 speed advantage, you can double attack)");
			 }
		 });
		textstats[2] = new JTextField("type Speed here");
		
		
		stathelp[3] = new JButton("Luck");
		stathelp[3].addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "1 point of luck gives 1 point of hit, avoid, and critavoid");
			 }
		 });
		textstats[3] = new JTextField("type Luck here");	
		
		
		stathelp[4] = new JButton("Motion");
		stathelp[4].addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "2 point of Motion gives + 1 avoid, 3 motion gives +1 hit, and 3 motion gives  +1 defense");
			 }
		 });
		textstats[4] = new JTextField("type Motion here");
		
		
		stathelp[5] = new JButton("Defense");
		stathelp[5].addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "1 point of Defense gives + 1 def");
			 }
		 });
		textstats[5] = new JTextField("type Defense here");
		
		
		stathelp[6] = new JButton("Resistance");
		stathelp[6].addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "1 point of Resistance gives + 1 res");	
				
			 }
		 });
		textstats[6] = new JTextField("type Resistance here");
		
		calc = new JButton("Calculate");
		calc.addActionListener(new ActionListener(){ 
			 public void actionPerformed(ActionEvent e){
				 /**
				  * try/catch on actionperformed so that instructions will be given should someone mess with the inputs
				  */
				 try{
				 FeCalculator calculate = new FeCalculator();
				/**
				 * create String that will read textstats' JTextField inputs
				 */
				 String Strengthinput = textstats[0].getText();
				 /**
				  * create an int variable that gets the Strength from FeCalculator
				  */
				 int Strength = calculate.getStrength();
				 /**
				  * use int variable to change String
				  */
				 Strength = Integer.parseInt(Strengthinput);
			
				String Skillinput = textstats[1].getText();
				int Skill = calculate.getSkill();
				    Skill = Integer.parseInt(Skillinput);
				    
				String Speedinput = textstats[2].getText();
				int Speed = calculate.getSpeed();
				Speed = Integer.parseInt(Speedinput);
				
				String Luckinput = textstats[3].getText();
				int Luck = calculate.getLuck();
				Luck = Integer.parseInt(Luckinput);
				
				String Motioninput = textstats[4].getText();
				int Motion = calculate.getMotion();
				Motion = Integer.parseInt(Motioninput);
				
				String Defenseinput = textstats[5].getText();
				int Defense = calculate.getDefense();
				Defense = Integer.parseInt(Defenseinput);
				
				String Resistanceinput = textstats[6].getText();
				int Resistance = calculate.getResistance();
				Resistance = Integer.parseInt(Resistanceinput);
				
				/**
				 * have the stats set according to the inputs along with the stats' calculations
				 */
				  int atk = calculate.getAtk();
				  calculate.setAtk(Strength);
				  int def = calculate.getDef();
				  calculate.setDef(Defense + Motion/3);
				  int res = calculate.getRes();
				  calculate.setRes(Resistance);
				  int hit = calculate.getHit();
				  calculate.setHit(Skill + Luck + Motion/3);
				  int avoid = calculate.getAvoid();
				  calculate.setAvoid(3*Speed + Luck + Motion/2);
				  int crit = calculate.getCrit();
				  calculate.setCrit(Skill/2);
				  int critavoid = calculate.getCritavoid();
				  calculate.setCritavoid(Luck);
				  
				/**
				 * have the results shown to the user 
				 */
				  
	 JOptionPane.showMessageDialog(null,"total attack is" + calculate.atk + ", total defense is" + calculate.def + ", total resistance is"
				 + calculate.res + ", total Hitrate is" + calculate.hit + ", total avoid is" + calculate.avoid + ", total critical hitrate is"
				 + calculate.crit + ", total criticalhitavoid is" + calculate.critavoid);
			 }
			 
			 catch(Exception a){
				 /**
				  * notice for someone doing wrong inputs
				  */
				  JOptionPane.showMessageDialog(null, "Invalid Submission. Please have Integers on all slots before calculating");
			 }
			 }
		 });
		/**
		 * add the variables onto the Gui
		 */
		add(labelstats);
		for(int i=0; i<7; i++){
			labelstats.add(textstats[i]);
			labelstats.add(stathelp[i]);
		}
		
		labelstats.add(calc);
	}

}
