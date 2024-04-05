package com.oops._15032024;

public class EmployeeManagement 
		extends UpdateProcessAgent
			implements Delete_Get_ProcessAgent, Registration_GetPRocessAgent{
	
	public void registrationProcess()
	{
		System.out.println("Registration process started");
	}
	
	public void updateProcess()
	{
		System.out.println("update process started");
	}
	
	public void deleteProcess()
	{
		System.out.println("Delete process started");
	}
	
	public void getProcess()
	{
		System.out.println("get process started");
	}

}
