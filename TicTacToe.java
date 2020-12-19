import javax.swing.*;
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
import java.util.*;
//<applet code="TicTacToe" height="380" width="550"></applet>
public class TicTacToe extends Applet  implements ActionListener
{
	JButton breset;
	Label win,draw,lose,winner;
	Font font,textfont;
	Image i1,i2;
	int chance=0;
	Random random=new Random();
	int iwin=0,idraw=0,ilose=0;
   static int image[]=new int[9];
	   int k;
    static int gameover=0;
	 
	 JButton b[]=new JButton[9];
	public void init()
	{
			
			setLayout(null);
			setBackground(Color.DARK_GRAY);
			for(int i=0; i<9; i++)
			{
				b[i]=new JButton();
				b[i].setBackground(Color.gray);
				b[i].setForeground(Color.red);
				b[i].setFont(font);
			
				add(b[i]);
					b[i].addActionListener(this);
			}
		
		breset=new JButton("Reset");
		breset.setBackground(Color.YELLOW);
		breset.setForeground(Color.DARK_GRAY);
		font=new Font("Serif",Font.BOLD,40);
		textfont=new Font("Arial",Font.PLAIN,30);
		win=new 	 Label("Win   : "+iwin);
		draw=new Label("Draw : "+idraw);
		lose=new Label("Lose  : "+ilose);

		winner=new Label("");
		
		for(int i=0; i<9; i++)
		{
			image[i]=0;
		}

		setFont(font);
		setLayout(null);
		b[0].setBounds(20,20,100,100);
		b[1].setBounds(140,20,100,100);
		b[2].setBounds(260,20,100,100);
		b[3].setBounds(20,140,100,100);
		b[4].setBounds(140,140,100,100);
		b[5].setBounds(260,140,100,100);
		b[6].setBounds(20,260,100,100);
		b[7].setBounds(140,260,100,100);
		b[8].setBounds(260,260,100,100);

		win.setBounds(380,20,150,60);
		draw.setBounds(380,80,150,60);
		lose.setBounds(380,140,150,60);
		winner.setBounds(380,200,150,60);
		breset.setBounds(380,260,150,100);
		win.setBackground(Color.DARK_GRAY);
		draw.setBackground(Color.DARK_GRAY);
		lose.setBackground(Color.DARK_GRAY);
		winner.setBackground(Color.DARK_GRAY);
		winner.setForeground(Color.YELLOW);
		win.setForeground(Color.WHITE);
		lose.setForeground(Color.WHITE);
		draw.setForeground(Color.WHITE);

		win.setFont(textfont);
	    lose.setFont(textfont);
		winner.setFont(textfont);
		draw.setFont(textfont);
	
		breset.setFont(font);

	
		add(breset);
		add(win);
		add(draw);
		add(lose);
		add(winner);
		breset.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==breset)
		{
			for(int i=0; i<9; i++)
			{
				
				b[i].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\blank.png"));
				image[i]=0;
				gameover=0;
				
					win.setText("Win   : "+iwin);
						draw.setText("Draw : "+idraw);
						lose.setText("Lose  : "+ilose);
						winner.setText("");


			}
		}
		

		
			start:
		

		for(int j=0; j<9; j++)
		{
				
				if(e.getSource()==b[j] &&gameover==0)
				{
			
				if(image[j]==0)
				{
				b[j].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\cross.png"));		
				
				image[j]=1;
				checkwinner();
				if(gameover==0)
				{
					chance=0;
				
					if(image[0]==image[1] && image[0]>0 && image[2]==0)
					{
					
						b[2].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\circle.png"));
						image[2]=2;
						chance=1;
						
					}
					else if(image[0]==image[4]&& image[0]>0 && image[8]==0)
					{
					
						b[8].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\circle.png"));
						image[8]=2;
						chance=1;
						

					}
					else if(image[0]==image[3]&& image[0]>0 && image[6]==0)
					{
						b[6].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\circle.png"));
						image[6]=2;
						chance=1;
						
					}
					else if(image[1]==image[2]&& image[1]>0 && image[0]==0)
					{
						b[0].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\circle.png"));
						image[0]=2;
						chance=1;
					
					}
					else if(image[1]==image[4]&& image[1]>0  && image[7]==0)
					{
				
						b[7].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\circle.png"));
						image[7]=2;
						chance=1;
					}
					else  if(image[2]==image[4]&& image[2]>0 && image[6]==0)
					{
					
						b[6].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\circle.png"));
						image[6]=2;
						chance=1;
						
					
					}
					else  if(image[2]==image[5]&& image[2]>0 && image[8]==0 )
					{
						
						b[8].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\circle.png"));
						image[8]=2;
						chance=1;
						
					}
					else if(image[3]==image[4]&& image[4]>0  && image[5]==0)
					{
						
						b[5].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\circle.png"));
						image[5]=2;
						chance=1;
						
					}
				 else if(image[3]==image[6]&& image[3]>0  && image[0]==0)
					{
						
						b[0].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\circle.png"));
						image[0]=2;
						chance=1;
						
					}
				 else if(image[4]==image[5] && image[4]>0 && image[3]==0)
					{
						
						b[3].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\circle.png"));
						image[3]=2;
						chance=1;
						
					}
				 else if(image[4]==image[7]&& image[4]>0 && image[1]==0)
					{
						
						b[1].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\circle.png"));
						image[1]=2;
						chance=1;
						
					}
					 else if(image[4]==image[6] && image[4]>0  && image[2]==0)
					{
						
						b[2].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\circle.png"));
						image[2]=2;
						chance=1;
						
					}
					
					 else if(image[8]==image[4] && image[4]>0 && image[0]==0 )
					{
						
						b[0].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\circle.png"));
						image[0]=2;
						chance=1;
						
					}

					
					 else if(image[6]==image[7]&& image[6]>0 && image[8]==0)
					{
						
						
						b[8].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\circle.png"));
						image[8]=2;
						chance=1;
						
					}
					 else if(image[5]==image[8] && image[5]>0  && image[2]==0)
					{
						b[2].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\circle.png"));
						image[2]=2;
						chance=1;
						
					}
					 else if(image[7]==image[8] && image[7]>0  && image[6]==0)
					{
						b[6].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\circle.png"));
						image[6]=2;
						chance=1;
						
					}
					 else if(image[0]==image[2] && image[0]>0  && image[1]==0)
					{
				
						b[1].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\circle.png"));
						image[1]=2;
						chance=1;
						
					}
					 else if(image[0]==image[6] && image[0]>0  && image[3]==0)
					{
				
						b[3].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\circle.png"));
						image[3]=2;
						chance=1;
						
					}
					else if(image[0]==image[8] && image[0]>0  && image[4]==0)
					{
				
						b[4].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\circle.png"));
						image[4]=2;
						chance=1;
						
					}
					else if(image[1]==image[7] && image[1]>0  && image[4]==0)
					{
				
						b[4].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\circle.png"));
						image[4]=2;
						chance=1;
						
					}
					else if(image[2]==image[6] && image[2]>0  && image[4]==0)
					{
				
						b[4].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\circle.png"));
						image[4]=2;
						chance=1;
						
					}
					else if(image[2]==image[8] && image[2]>0  && image[5]==0)
					{
				
						b[5].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\circle.png"));
						image[5]=2;
						chance=1;
						
					}
					else if(image[3]==image[5] && image[3]>0  && image[4]==0)
					{
				
						b[4].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\circle.png"));
						image[4]=2;
						chance=1;
						
					}
					else if(image[6]==image[8] && image[6]>0  && image[7]==0)
					{
				
						b[7].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\circle.png"));
						image[7]=2;
						chance=1;
						
					}
					else if(image[0]==1 || image[2]==1 || image[6]==1 || image[8]==1 )
					{
						if(image[4]==0)
						{

						b[4].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\circle.png"));
						image[4]=2;
						chance=1;
						}
					}
					if(chance==1)
						{
							checkwinner();
							
						}
					else if(chance==0)
					{
						int a=1;
						while(a<=100)
						{
							k=random.nextInt(9);
							if(image[k]==0)	
							{
					
							b[k].setIcon(new ImageIcon("F:\\Home java\\TicTacToe\\circle.png"));	
							image[k]=2;
							break ;
					
							}	
						   a++;
						}
					}
									

				}
					checkwinner();
				if(gameover==3)
				{
					winner.setText("Draw");

						idraw++;
						draw.setText("Draw : "+idraw);
				}		
				else if(gameover==1 || gameover==2) 
				{
					if(gameover==1)
					{
						winner.setText("You win");
						iwin++;
					}
					if(gameover==2)
					{
						winner.setText("You lose");
						ilose++;
					}
							win.setText("Win   : "+iwin);
						
						lose.setText("Lose  : "+ilose);

				
				}

			
					}
						
				}		
				
		}


	}
	
	public static void checkwinner()
	{
			
			
			if(image[0]==image[1] && image[0]==image[2])
				{
				gameover=image[0];
				}
				else if(image[0]==image[4] && image[8]==image[4])
				{
				gameover=image[0];
				}
				else if(image[0]==image[3] && image[0]==image[6])
				{		
				gameover=image[0];
				}
				else if(image[1]==image[4] && image[1]==image[7])
				{
				gameover=image[1];
				}
				else if(image[2]==image[5] && image[5]==image[8])
				{
				gameover=image[2];
				}
				else if(image[2]==image[4] && image[4]==image[6])
				{
					gameover=image[2];
				}
				else if(image[3]==image[4] && image[4]==image[5])
				{
					gameover=image[3];
				}
				else if(image[6]==image[7] && image[6]==image[8])
				{
					gameover=image[6];
				}
				if(gameover==0 && image[1]>0 &&image[2]>0 &&image[3]>0 && image[4]>0 && image[5]>0 && image[6]>0 && image[7]>0 && image[8]>0 &&image[0]>0 )
				{
							gameover=3;

				}
	}
	
}
	