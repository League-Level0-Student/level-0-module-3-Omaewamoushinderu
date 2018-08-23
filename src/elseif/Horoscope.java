package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String star = JOptionPane.showInputDialog("What's your star sign?");
if(star.equals("Aquarius"))	{
JOptionPane.showMessageDialog(null,"\n" + 
		"\n" + 
		"After an intense time of focus on one thing, today you can relax and appreciate what youve achieved.\n" + 
		"\n" + 
		"Youve either been very focussed on one thing lately or youve been involved in a consuming project thats not allowed you to think about much else. This intense focus youve had has generate great results, but its been exhausting. Now the worst is over, give yourself some time off today to take a breather and appreciate all the hard work youve put in.");
}
else if (star.equals("Pices")) {
JOptionPane.showMessageDialog(null, "\n" + 
		"\n" + 
		"When a family decision threatens to overshadow a work issue today, find balance and let go of control.\n" + 
		"\n" + 
		"You have a tough work decision to make today, but a family decision is weighing heavily on your mind. This is going to make it difficult for you to focus on the work issue, but youll need to create balance and to know when to put the family drama aside for a while. Accept that you cant control every situation and sometimes you have to let things work themselves out.");
}
else if(star.equals("Aries")) {
JOptionPane.showMessageDialog(null, "\n" + 
		"\n" + 
		"Accept that you cant please everyone today and dont let anyone bring you down, live your way.\n" + 
		"\n" + 
		"If you want to make it through today in a happy and carefree way today youre going to have to accept that you cant please everyone. There will always be someone who is not happy with your choices, but they are your choices and no one elses. Dont let anyone bring you down about the way you live your life. Keep living it your own way for you.");

}
else if(star.equals("Taurus")) {
JOptionPane.showMessageDialog(null, "Learn from those people you admire today and focus on the future, forget about the past, and move forward.\n" + 
		"\n" + 
		"There are those around you who you greatly admire for the way they live their lives and its time to take a leaf out of their book and learn from them. See how they live for today and the future? Its time to let go of the past and anything holding you back and focus on whats ahead of you. Be like those you look up to and follow their lead, start moving forward with purpose.");
}
else if(star.equals("Gemini")) {
	JOptionPane.showMessageDialog(null, "\n" + 
			"\n" + 
			"Dont go looking for a fight today just because you have tough energy, make sure its worth it.\n" + 
			"\n" + 
			"You feel tough and ready to stand up for what you believe in today. You feel like you can take on anyone who crosses you. Its great to have strong determined energy, but be careful you dont go looking for a fight where there isnt one. Just because you have the strength doesnt mean you have to use it. Make sure its a worthwhile fight before you get involved.");
}
else if (star.equals("Cancer")) {
JOptionPane.showMessageDialog(null, "Only spend time on the big ideas today, though you have lots of great ideas, and know that your words have impact.\n" + 
		"\n" + 
		"You have great ideas today, Cancer, and youre feeling smart and fast. However, dont waste time on any ideas that arent worth it, only spend your efforts on the big hitting ideas that will certainly lead to big things for you. Keep in mind that what you say will be taken seriously and to heart and even when you write something down it will have a big impact.");
}
else if(star.equals("Leo")) {
JOptionPane.showMessageDialog(null, "\n" + 
		"\n" + 
		"Mercury will concentrate its energy in your work life today and youll see clearly what you want.\n" + 
		"\n" + 
		"With The Suns energy gone from your house, only Mercurys energy remains and it concentrates it all in your work life. Youll have great instincts in this area of your life and youll find you know what you want and where you want to be in your career easily. It will appear simple today and with this in mind, you can see your way forward.");
}
else if (star.equals("Virgo")) {
JOptionPane.showMessageDialog(null, "As The Sun enters your house today you have energy for re-inventing yourself and making big changes.\n" + 
		"\n" + 
		"The Sun enters Virgo today, giving you high energy for making big changes in your life and perhaps re-inventing yourself completely. This could mean giving yourself a complete make-over and changing your look drastically, or it could mean acting on one of those hopes and dreams youve been nurturing. Whatever it is, now is the time to be bold.");
}
else if (star.equals("Libra")) {
	JOptionPane.showMessageDialog(null, "\n" + 
			"\n" + 
			"As your head takes over today youll deal well with logical things, but not so well with the emotional.\n" + 
			"\n" + 
			"Logic and rationality will take over for you today and youll act less on your emotions and more on what your head tells you. This makes it a great time at work and for anything you are doing that needs a factual approach. However, this makes it a more difficult time in your relationship and with those close to you as youll be less empathetic and sensitive.");
}
else if (star.equals("Scorpio")) {
	JOptionPane.showMessageDialog(null, "Your partner should support you and love you for who you are, whether you already have one or you are looking for one.\n" + 
			"\n" + 
			"Whether you already have a partner or you are looking for one, remember your self worth. You need someone who lifts you up, supports you in all you do, and loves you for who you are. Your special someone should never be bringing you down and making you feel taken advantage of. Make sure you are sharing your life with someone who really cares.");
}
else if (star.equals("Sagittarius")) {
	JOptionPane.showMessageDialog(null, "\n" + 
			"\n" + 
			"Use your high energy to get lots done today, but dont rush and make mistakes, check everything.\n" + 
			"\n" + 
			"You have very high energy today and youll feel like you are riding a wave. Use this energy while you have it and get lots done, but be aware that high energy can sometimes cause you to rush, and thats when you make mistakes. Slow down if you need to and check everything. Mistakes will only mean you have to go back later to correct them, wasting your time.");
}
else if (star.equals("Capricorn")) {
	JOptionPane.showMessageDialog(null, "\n" + 
			"\n" + 
			"As The Moon leaves your house today you have low energy and youll work better on your own.\n" + 
			"\n" + 
			"The Moon leaves Capricorn today, making you feel quite insular. Its not a good day for team work and youll do much better getting on with what you have to do on your own. If you do have to work with others, take a low profile role in the group that means you can work quietly without too much interaction. This low energy will pass so keep our head down.");
}
else {
	JOptionPane.showMessageDialog(null, "Thats not a star sign!");
}
}
}






