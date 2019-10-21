package com.javaSource.Send_Mail_Auto;

import java.util.TimerTask;
import com.javaConstants.Constants;

public class Testing extends TimerTask
{
    
	String htmlMessage="<!DOCTYPE html>\r\n" + 
			"<html>\r\n" + 
			"<head>\r\n" + 
			"<style>\r\n" + 
			"table {\r\n" + 
			"  font-family: arial, sans-serif;\r\n" + 
			"  border-collapse: collapse;\r\n" + 
			"  width: 100%;\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"td, th {\r\n" + 
			"  border: 1px solid #dddddd;\r\n" + 
			"  text-align: left;\r\n" + 
			"  padding: 8px;\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"tr:nth-child(even) {\r\n" + 
			"  background-color: #dddddd;\r\n" + 
			"}\r\n" + 
			"</style>\r\n" + 
			"</head>\r\n" + 
			"<body style=\"background-color:lightgreen\">\r\n" + 
			"<h1>this is Daily invoice report</h1>"+
			"\r\n" + 
			"<h2>HTML Table</h2>\r\n" + 
			"\r\n" + 
			"<table>\r\n" + 
			"  <tr>\r\n" + 
			"    <th>Company</th>\r\n" + 
			"    <th>Contact</th>\r\n" + 
			"    <th>Country</th>\r\n" + 
			"  </tr>\r\n" + 
			"  <tr>\r\n" + 
			"    <td>Alfreds Futterkiste</td>\r\n" + 
			"    <td>Maria Anders</td>\r\n" + 
			"    <td>Germany</td>\r\n" + 
			"  </tr>\r\n" + 
			"  <tr>\r\n" + 
			"    <td>Centro comercial Moctezuma</td>\r\n" + 
			"    <td>Francisco Chang</td>\r\n" + 
			"    <td>Mexico</td>\r\n" + 
			"  </tr>\r\n" + 
			"  <tr>\r\n" + 
			"    <td>Ernst Handel</td>\r\n" + 
			"    <td>Roland Mendel</td>\r\n" + 
			"    <td>Austria</td>\r\n" + 
			"  </tr>\r\n" + 
			"  <tr>\r\n" + 
			"    <td>Island Trading</td>\r\n" + 
			"    <td>Helen Bennett</td>\r\n" + 
			"    <td>UK</td>\r\n" + 
			"  </tr>\r\n" + 
			"  <tr>\r\n" + 
			"    <td>Laughing Bacchus Winecellars</td>\r\n" + 
			"    <td>Yoshi Tannamuri</td>\r\n" + 
			"    <td>Canada</td>\r\n" + 
			"  </tr>\r\n" + 
			"  <tr>\r\n" + 
			"    <td>Magazzini Alimentari Riuniti</td>\r\n" + 
			"    <td>Giovanni Rovelli</td>\r\n" + 
			"    <td>Italy</td>\r\n" + 
			"  </tr>\r\n" + 
			"</table>\r\n" + 
			"\r\n" + 
			"</body>\r\n" + 
			"</html>\r\n" + 
			"";
	public void run()
	{

                GMailServer sender = new GMailServer(Constants.setFrom, Constants.setPassword);

	            try {
			    sender.sendMail("Subject",htmlMessage,Constants.setFrom,Constants.emailTO);
			}
                   catch (Exception e) {
			     e.printStackTrace();
			}  

				System.out.println("Email Sent Succesfully...");

	        }
}
