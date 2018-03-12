package models;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

public class CDModel {
	private String name;
	private Date releaseDate;
	private int price;
	private Image cover;
	
	public CDModel(String name, Date releaseDate, int price, Image cover) {
		this.name = name;
		this.releaseDate = releaseDate;
		this.price = price;
		this.cover = cover;
	}
	
	public CDModel(String name, Date releaseDate, int price, String coverFilepath) throws IOException {
		this.name = name;
		this.releaseDate = releaseDate;
		this.price = price;
		this.cover = ImageIO.read(new File(coverFilepath));

		
	}
	
	public CDModel() throws IOException {
		this.name = new String();
		this.releaseDate = new Date();
		this.price = 0;		
		this.cover = ImageIO.read(new File("D:\\java\\placeholder.png"));
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Image getCover() {
		return cover;
	}

	public void setCover(Image cover) {
		this.cover = cover;
	}
	
	public String getName() {
		return name;
	}

}
