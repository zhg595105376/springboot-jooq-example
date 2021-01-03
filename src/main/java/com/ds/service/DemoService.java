package com.ds.service;

import java.math.BigDecimal;
import java.util.List;

import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.tools.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jooq.generator.tables.daos.BookDao;
import com.jooq.generator.tables.pojos.Book;

import lombok.extern.slf4j.Slf4j;

@Service
public class DemoService {
	@Autowired
	private DSLContext create;
	@Autowired
	private BookDao bookDao;
	
	com.jooq.generator.tables.Book tableBook = com.jooq.generator.tables.Book.BOOK;
	/**
	 * 通过dao查询
	 */
	public void selectByDao() {
		
		//Book book = bookDao.findById(id);//通过id查询返回对象
		
		//List<Book> list = bookDao.fetchById(ids);//通过多个id返回对象列表
		
		//Book book = bookDao.fetchOne(tableBook.NAME, "三国");
		//System.out.println(book);
		
		//范围查询，图书价格在100和200之间(包含100和200)
		List<Book> list = bookDao.fetchRangeOfPrice(new BigDecimal(100), new BigDecimal(200));
		System.out.println(list);
	}
	/**
	 * 复杂sql语句查询用create来拼接
	 */
	public void selectByCreate(String bookname) {
		//返回单条记录
		Book book = create.selectFrom(tableBook).where(tableBook.ID.eq(2L)).fetchAnyInto(Book.class);
		
		//返回单个属性
		String bookName = create.select(tableBook.NAME).from(tableBook).where(tableBook.ID.eq(2L)).fetchAnyInto(String.class);
		
		
		//复杂的sql语句，或者多表联查
		List<Book> list = create.selectFrom(tableBook).where(tableBook.NAME.eq("西游记")).fetchInto(Book.class);
		System.out.println(list);
		//或者用下面这种
		
		// 写一个一定成立的条件，这里写主键不为空
        Condition eq = tableBook.ID.isNotNull();
        if(!StringUtils.isBlank(bookname)) {
        	eq = eq.and(tableBook.NAME.eq(bookname));
        }
		list = create.selectFrom(tableBook).where(eq).fetchInto(Book.class);
		System.out.println(list);
		
	}
	
	public void updateByDao() {
		//name没有设置，更新的时候name会被设置为null
		Book b = new Book();
	//	b.setName("xxx");
		b.setId(2L);
		b.setPrice(new BigDecimal(500));
		bookDao.update(b);
	}
	public void insertByDao() {
		Book b = new Book();
		b.setName("大话西游");
		b.setPrice(new BigDecimal(600));
		bookDao.insert(b);
	}
	
	public void updateByCreate() {
		create.update(tableBook).set(tableBook.PRICE,new BigDecimal(200)).where(tableBook.ID.eq(1L)).execute();
	}
}
