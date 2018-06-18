package com.rusia2018.common;

public enum Teams {
	Russia			( 1,	"Russia"),
	SaudiaArabia	( 2,	"Saudia Arabia "),
	Egypt			( 3,	"Egypt"),
	Uruguay			( 4,	"Uruguay"),
	Portugal		( 5,	"Portugal"),
	Spain			( 6,	"Spain"),
	Morocco			( 7,	"Morocco"),
	Iran			( 8,	"Iran"),
	France			( 9,	"France"),
	Australia		(10,	"Australia"),
	Peru			(11,	"Peru"),
	Denmark			(12,	"Denmark"),
	Argentina		(13,	"Argentina"),
	Iceland			(14,	"Iceland"),
	Croatia			(15,	"Croatia"),
	Nigeria			(16,	"Nigeria"),
	Brazil			(17,	"Brazil"),
	Switzerland		(18,	"Switzerland"),
	CostaRica		(19,	"Costa Rica"),
	Serbia			(20,	"Serbia"),
	Germany			(21,	"Germany"),
	Mexico			(22,	"Mexico"),
	Sweden			(23,	"Sweden"),
	SouthKorea		(24,	"South Korea"),
	Belgium			(25,	"Belgium"),
	Panama			(26,	"Panama"),
	Tunisia			(27,	"Tunisia"),
	England			(28,	"England"),
	Poland			(29,	"Poland"),
	Senegal			(30,	"Senegal"),
	Colombia		(31,	"Colombia"),
	Japan			(32,	"Japan");
	
	
	//Attributes
	private Integer id;
	private String name;
	
	//Constructor
	Teams(Integer id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	//Methods
	public static String getNamebyId(Integer id) {
		String name ="";
		for (Teams team : Teams.values()) {
			if(team.id == id)
				name = team.name;
		}
		return name;
	}
	
	
	public static void main(String[] args) {
		System.out.println(Teams.getNamebyId(1));
	}
	
	 
}
