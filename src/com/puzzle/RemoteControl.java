package com.puzzle;

public class RemoteControl {
	
	
	public int clicks(String startAndEnd, String channels){
		
		if(startAndEnd==null || channels==null){
			return 0;
		}
		String[] startEndArr = null;
		String[] channelArr = null;
		
		if(startAndEnd.contains(",") && channels.contains(",")){
		startEndArr = startAndEnd.split(",");
		channelArr = channels.split(",");
		}
		else{
			return 0;
		}
		
		System.out.println("xxxxxxx");
		
		if(startEndArr.length!=2){
			return 0;
		}
		
		if(!isDigit(startEndArr) || !isDigit(channelArr)){
			return 0;
		}
		
		Integer start = Integer.parseInt(startEndArr[0]);
		Integer end = Integer.parseInt(startEndArr[1]);
		Integer prev = null;
		int clicks = 0;
		
		for(int i=0;i<channelArr.length;i++){
			Integer num = Integer.parseInt(channelArr[i]);
			
			if(num>=start && num<=end){
				
				if(num==prev || Math.abs(num-start)==1 || Math.abs(num-end)==1){
					clicks++;
				}
				else{	
					//22,23,34,23
					
					if(Math.abs(num-start)>1 || Math.abs(num-end)>1){
						if(channelArr[i].length()>1){

							clicks+=channelArr[i].length();
						}
						else{
							clicks++;
						}
					}
				}
				if(i>0)
				prev = Integer.parseInt(channelArr[i-1]);
			}
			else{
				clicks=0;
				break;
			}
			
			
		}
		
		
		
		return clicks;
	}
	

	private boolean isDigit(String[] arr) {
		boolean isDigit = true;
		for(String s:arr){
			if(!s.matches("[0-9]+")){
				isDigit=false;
				break;
			}
		}
		return isDigit;
	}


	public static void main(String[] args) {
		
		RemoteControl c = new RemoteControl();
				
		String startEnd = "0,999";
		String channel="0,23,233,234";
		
		System.out.println(c.clicks(startEnd, channel));
		

	}

}
