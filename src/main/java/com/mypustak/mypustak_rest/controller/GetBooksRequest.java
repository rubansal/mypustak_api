package com.mypustak.mypustak_rest.controller;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //lets it know that there is some mapping
@Table(name="books")
public class GetBooksRequest {

    @Id
    private int book_id;
    private String sku;
    private String isbn;
    private String title;
    private String slug;
    private String thumb;
    private String author;
    private String publication;
    private int category;
    //private int publication_date;
    private double price;
    private double discount_price;
    private String weight;
    private String binding;
    private String edition;
    private double shipping_cost;
    //private String book_desc;
//    private String book_desc_url;
//    private String no_of_pages;
//    private String language;
//    private char is_allow_multi_order;
//    private int qty;
//    private char published;
//    private char is_cashondelivery;
//    private char is_featured;
//    private char is_publication_house;
//    private char is_out_of_stock;
//    private char is_deleted;
//    private String is_doubtful;
//    //private String keywords;
//    private int i_by;
//    private int i_date;
//    private int u_by;
//    private int u_date;
//    private String uploaded_by;
    //private String actual_date_upload;
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getThumb() {
		return thumb;
	}
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
//	public int getPublication_date() {
//		return publication_date;
//	}
//	public void setPublication_date(int publication_date) {
//		this.publication_date = publication_date;
//	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount_price() {
		return discount_price;
	}
	public void setDiscount_price(double discount_price) {
		this.discount_price = discount_price;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getBinding() {
		return binding;
	}
	public void setBinding(String binding) {
		this.binding = binding;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public double getShipping_cost() {
		return shipping_cost;
	}
	public void setShipping_cost(double shipping_cost) {
		this.shipping_cost = shipping_cost;
	}
//	public String getBook_desc_url() {
//		return book_desc_url;
//	}
//	public void setBook_desc_url(String book_desc_url) {
//		this.book_desc_url = book_desc_url;
//	}
//	public String getNo_of_pages() {
//		return no_of_pages;
//	}
//	public void setNo_of_pages(String no_of_pages) {
//		this.no_of_pages = no_of_pages;
//	}
//	public String getLanguage() {
//		return language;
//	}
//	public void setLanguage(String language) {
//		this.language = language;
//	}
//	public char getIs_allow_multi_order() {
//		return is_allow_multi_order;
//	}
//	public void setIs_allow_multi_order(char is_allow_multi_order) {
//		this.is_allow_multi_order = is_allow_multi_order;
//	}
//	public int getQty() {
//		return qty;
//	}
//	public void setQty(int qty) {
//		this.qty = qty;
//	}
//	public char getPublished() {
//		return published;
//	}
//	public void setPublished(char published) {
//		this.published = published;
//	}
//	public char getIs_cashondelivery() {
//		return is_cashondelivery;
//	}
//	public void setIs_cashondelivery(char is_cashondelivery) {
//		this.is_cashondelivery = is_cashondelivery;
//	}
//	public char getIs_featured() {
//		return is_featured;
//	}
//	public void setIs_featured(char is_featured) {
//		this.is_featured = is_featured;
//	}
//	public char getIs_publication_house() {
//		return is_publication_house;
//	}
//	public void setIs_publication_house(char is_publication_house) {
//		this.is_publication_house = is_publication_house;
//	}
//	public char getIs_out_of_stock() {
//		return is_out_of_stock;
//	}
//	public void setIs_out_of_stock(char is_out_of_stock) {
//		this.is_out_of_stock = is_out_of_stock;
//	}
//	public char getIs_deleted() {
//		return is_deleted;
//	}
//	public void setIs_deleted(char is_deleted) {
//		this.is_deleted = is_deleted;
//	}
//	public String getIs_doubtful() {
//		return is_doubtful;
//	}
//	public void setIs_doubtful(String is_doubtful) {
//		this.is_doubtful = is_doubtful;
//	}
//	public int getI_by() {
//		return i_by;
//	}
//	public void setI_by(int i_by) {
//		this.i_by = i_by;
//	}
//	public int getI_date() {
//		return i_date;
//	}
//	public void setI_date(int i_date) {
//		this.i_date = i_date;
//	}
//	public int getU_by() {
//		return u_by;
//	}
//	public void setU_by(int u_by) {
//		this.u_by = u_by;
//	}
//	public int getU_date() {
//		return u_date;
//	}
//	public void setU_date(int u_date) {
//		this.u_date = u_date;
//	}
//	public String getUploaded_by() {
//		return uploaded_by;
//	}
//	public void setUploaded_by(String uploaded_by) {
//		this.uploaded_by = uploaded_by;
//	}


    
}
