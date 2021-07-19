package com.tnt.util;

/**
 * 功能描述：分页的工具类
 * @author tym
 *
 */
public class PageUtil {
	private int curruntPage;//当前页
	private int totalRows;//总记录数
	private int totalPages;//总页数
	private int pageSize;//每页显示的条数
	private int startIndex;//索引的起始页
	private int prevPage;//上一页
	private int nextPage;//下一页
	
	
	
	/**
	*功能描述：构造器<br>
	*作者：tym<br>
	*时间：2021年7月9日下午2:14:54
	*/
	public PageUtil(String page, int totalRows, int pageSize) {
		super();
		//处理当前页
		this.setCPage(page);
		this.totalRows = totalRows;
		this.pageSize = pageSize;
		//处理总页数
		this.setTPages();
		//索引的起始页
		this.setSIndex();
		//上一页
		this.setPPage();
		//下一页
		this.setNPage();
	}
	
	/**
	*功能描述：下一页<br>
	*作者：zz<br>
	*时间：2021年7月9日下午2:22:54
	*/
	private void setNPage(){
	if(this.curruntPage == this.totalPages){
		this.nextPage = this.totalPages;
	}else{
			this.nextPage = this.curruntPage + 1;
		}
	}
	
	/**
	*功能描述：上一页<br>
	*作者：zz<br>
	*时间：2021年7月9日下午2:24:11
	*/
	private void setPPage(){
	if(this.curruntPage == 1){
		this.prevPage = 1;
	}else{
			this.prevPage = this.curruntPage - 1;
		}
	}

	/**
	*功能描述：索引起始页<br>
	*作者：zz<br>
	*时间：2021年7月9日下午2:21:24
	*/
	private void setSIndex(){
		startIndex=(this.curruntPage-1) * this.pageSize;
	}
	
	/**
	*功能描述：总页数<br>
	*作者：zz<br>
	*时间：2021年7月9日下午2:19:45
	*/
	private void setTPages(){
	if(totalRows % pageSize==0){
		totalPages = totalRows / pageSize;
	}else{
			totalPages = totalRows / pageSize+1;
		}
	}

	/**
	 * 处理当前页
	 * @param curruntPage2
	 */
	private void setCPage(String page) {
		if(page==null||"".equals(page)){
				curruntPage=1;
			}else{
				curruntPage=Integer.valueOf(page);
			}
	}
	
	
	public PageUtil() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCurruntPage() {
		return curruntPage;
	}
	public void setCurruntPage(int curruntPage) {
		this.curruntPage = curruntPage;
	}
	public int getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	public int getPrevPage() {
		return prevPage;
	}
	public void setPrevPage(int prevPage) {
		this.prevPage = prevPage;
	}
	public int getNextPage() {
		return nextPage;
	}
	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}
	
	
	@Override
	public String toString() {
		return "PageUtil [curruntPage=" + curruntPage + ", totalRows=" + totalRows + ", totalPages=" + totalPages
				+ ", pageSize=" + pageSize + ", startIndex=" + startIndex + ", prevPage=" + prevPage + ", nextPage="
				+ nextPage + "]";
	}

	public static void main(String[] args) {
		PageUtil pageUtil = new PageUtil("1", 11, 5);
		System.out.println(pageUtil);
	}
}
