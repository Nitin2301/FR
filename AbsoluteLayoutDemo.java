import javax.swing.*;
import java.awt.*;

class AbsoluteLayoutDemo
{

		AbsoluteLayoutDemo()
		{

				int x,y,w,h;
				x = 200;
				y=100;
				w=100;
				h=40;

			JFrame f = new JFrame();		//Border Layout
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setSize(800,500);

			f.setLayout(null);


			JButton b1 = new JButton("North");
			b1.setBounds(x,y,w,h);

			JButton b2 = new JButton("South");
			b2.setBounds(x,y+60*1,w,h);

			JButton b3 = new JButton("East");
			b3.setBounds(x,y+60*2,w,h);

			JButton b4 = new JButton("West");
			b4.setBounds(x,y+60*3,w,h);

			JButton b5 = new JButton("Center");
			b5.setBounds(x,y+60*4,w,h);


			f.add(b1);
			f.add(b2);
			f.add(b3);
			f.add(b4);
			f.add(b5);

			f.setVisible(true);
		}

		public static void main(String[] a)
		{
			AbsoluteLayoutDemo F = new AbsoluteLayoutDemo();
		}


}
