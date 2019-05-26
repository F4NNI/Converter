import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



@SuppressWarnings({ "serial" })
public class CalcFrame extends JFrame
{
	double firstValue = 0;
	String operation = "+";
	
	CalcFrame()
	{
		//Размеры рабочего пространства калькулятора
		setBounds (500, 500 , 500, 500);
		setLayout (new BorderLayout());
		
		//Инициализация рабочего поля,кнопок(+наличие их символов)
		JTextArea display = new JTextArea();
		JPanel buttonPanel = new JPanel(new GridLayout(3, 5));
		JButton button0 = new JButton("0");
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton buttonSum = new JButton("+");
		JButton buttonBack = new JButton("C");
		JButton buttonDivide = new JButton("/");
		JButton buttonSub = new JButton("-");
		JButton buttonMul = new JButton("*");
		JButton buttonStart = new JButton("=");
		JButton buttonDeg = new JButton("^");
		JButton buttonSqrt = new JButton("@");
		//Добавление объектов и их выравнивание относительно сторон рабочего поля
		add(display, BorderLayout.NORTH);
		add(buttonPanel,BorderLayout.CENTER);
		add(buttonStart,BorderLayout.WEST);
		//Размещение кнопок на панели
		buttonPanel.add(buttonBack);
		buttonPanel.add(buttonDivide);
		buttonPanel.add(buttonMul);
		buttonPanel.add(buttonSum);
		buttonPanel.add(buttonSub);
		buttonPanel.add(buttonDeg);
		buttonPanel.add(button1);
		buttonPanel.add(button2);
		buttonPanel.add(button3);
		buttonPanel.add(button6);
		buttonPanel.add(button7);
		buttonPanel.add(buttonSqrt);
		buttonPanel.add(button4);
		buttonPanel.add(button5);
		buttonPanel.add(button0);
		buttonPanel.add(button9);
		buttonPanel.add(button8);
		buttonPanel.add(buttonStart);
		//Установка палитры кнопок
		buttonBack.setBackground(Color.orange);
		buttonDivide.setBackground(Color.orange);
		buttonMul.setBackground(Color.orange);
		buttonSum.setBackground(Color.orange);
		buttonDeg.setBackground(Color.orange);
		buttonSqrt.setBackground(Color.orange);
		buttonSub.setBackground(Color.orange);
		buttonStart.setBackground(Color.orange);
		
		button0.setBackground(Color.white);
		button1.setBackground(Color.white);
		button2.setBackground(Color.white);
		button3.setBackground(Color.white);
		button4.setBackground(Color.white);
		button5.setBackground(Color.white);
		button6.setBackground(Color.white);
		button7.setBackground(Color.white);
		button8.setBackground(Color.white);
		button9.setBackground(Color.white);
		//Устанавливаем видимость калькулятора
		setVisible (true);
		
		//Обработчик событий нажатия символов и их инициализация на форме
		button0.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed (ActionEvent e)
					{
						display.setText(display.getText()+"0");
					}
				});
		
		button1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed (ActionEvent e)
			{
				display.setText(display.getText()+"1");
			}
		});
		
		button2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed (ActionEvent e)
			{
				display.setText(display.getText()+"2");
			}
		});
		
		button3.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed (ActionEvent e)
			{
				display.setText(display.getText()+"3");
			}
		});
		
		button4.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed (ActionEvent e)
			{
				display.setText(display.getText()+"4");
			}
		});
		
		button5.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed (ActionEvent e)
			{
				display.setText(display.getText()+"5");
			}
		});
		
		button6.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed (ActionEvent e)
			{
				display.setText(display.getText()+"6");
			}
		});
		
		button7.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed (ActionEvent e)
			{
				display.setText(display.getText()+"7");
			}
		});
		
		button8.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed (ActionEvent e)
			{
				display.setText(display.getText()+"8");
			}
		});
		
		button9.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed (ActionEvent e)
			{
				display.setText(display.getText()+"9");
			}
		});
		
		//Операция удаления получившегося/лишнего числа
		buttonBack.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed (ActionEvent e)
			{
				String temp = display.getText();
				display.setText(temp.substring(0, temp.length() - 1));
			}
		});
		
		//Операция сложения
		buttonSum.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e)
					{
						firstValue = Integer.valueOf(display.getText());
						display.setText("");
						operation = "+";
					}
				});
		//Операция деления
		buttonDivide.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						firstValue = Integer.valueOf(display.getText());
						display.setText("");
						operation = "/";
					}
				});
		//Операция вычитания
		buttonSub.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				firstValue = Integer.valueOf(display.getText());
				display.setText("");
				operation = "-";
			}
		});
		//Операция умножения
		buttonMul.addActionListener(new ActionListener()

		{
			public void actionPerformed(ActionEvent e)
			{
				firstValue = Integer.valueOf(display.getText());
				display.setText("");
				operation = "*";
			}
		});
		//Операция возведения в степень
		buttonDeg.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						firstValue = Integer.valueOf(display.getText());
						display.setText("");
						operation = "^";
					}
				});
		//Операция вычисления корня числа
		buttonSqrt.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						firstValue = Integer.valueOf(display.getText());
						display.setText("");
						operation = "@";
					}
				});
		//Алгоритм выполнения каждой операции			
		buttonStart.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int secondValue = Integer.valueOf(display.getText());
				if("+".equals(operation))
				{
					display.setText((firstValue + secondValue)+"");
				}
				
				if("-".equals(operation))
				{
					display.setText((firstValue - secondValue)+"");
				}
				
				if("*".equals(operation))
				{
					display.setText((firstValue * secondValue)+"");
				}
				
				if("/".equals(operation)) 
				{
					display.setText((firstValue / secondValue)+"");
				}
				
				if("^".equals(operation))
				{
					display.setText((Math.pow(firstValue, secondValue))+"");
				}
				
				if("@".equals(operation))
				{
					display.setText((Math.sqrt(firstValue))+"");
				}
				
				firstValue = 0;
				operation = "+";
			}
		});
		
		
	}
	public static void main(String[] args)
	{
		//Запускаем на выполнение класс
		new CalcFrame();
	}
}
