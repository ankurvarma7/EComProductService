package com.projects.EComProductService.services;

import com.projects.EComProductService.demo.Author;
import com.projects.EComProductService.demo.AuthorRepo;
import com.projects.EComProductService.demo.Book;
import com.projects.EComProductService.demo.BookType;
import com.projects.EComProductService.models.Category;
import com.projects.EComProductService.models.Price;
import com.projects.EComProductService.models.Product;
import com.projects.EComProductService.repositories.CategoryRepo;
import com.projects.EComProductService.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InitServiceImpl implements InitService{

    private CategoryRepo categoryRepo;
    private ProductRepo productRepo;
    private AuthorRepo authorRepo;

    @Autowired
    public InitServiceImpl(CategoryRepo categoryRepo,ProductRepo productRepo1,AuthorRepo authorRepo1) {
        this.categoryRepo = categoryRepo;
        productRepo=productRepo1;
        authorRepo=authorRepo1;
    }

    @Override
    public void initialize() {
        Category electronics=new Category();
        electronics.setDescription("electronics");

        Price iPhonePrice=new Price();
        iPhonePrice.setAmount(100000);
        iPhonePrice.setCurrency("INR");
        iPhonePrice.setDiscount(0);

        Price iPadPrice=new Price();
        iPadPrice.setAmount(150000);
        iPadPrice.setCurrency("INR");
        iPadPrice.setDiscount(0);

        Product iPhone=new Product();
        iPhone.setTitle("iPhone");
        iPhone.setDescription("Best phone ever!!");
        iPhone.setImageUrl("www.google.com/iPhone");
        iPhone.setPrice(iPhonePrice);
        iPhone.setCategory(electronics);

        Product iPad=new Product();
        iPad.setTitle("iPad");
        iPad.setDescription("Best tab ever!!");
        iPad.setImageUrl("www.google.com/iPad");
        iPad.setPrice(iPadPrice);
        iPad.setCategory(electronics);

        electronics.setProductList(List.of(iPhone,iPad));
        Product product1=productRepo.save(iPhone);
        Product product2=productRepo.save(iPad);


        Author author=new Author();
        author.setName("J K Rowling");
        author.setEmail("jk@hpotter.com");

        Book book1=new Book();
        book1.setName("Harry Potter and the Chamber of Secrets");
        book1.setBookType(BookType.FICTION);
        book1.setAuthor(author);

        Book book2=new Book();
        book2.setName("Harry Potter and the Order of the Phoenix");
        book2.setBookType(BookType.FICTION);
        book2.setAuthor(author);

        Book book3=new Book();
        book3.setName("Harry Potter and the Deathly Hallows");
        book3.setBookType(BookType.FICTION);
        book3.setAuthor(author);

        List<Book> books=List.of(book1,book2,book3);
        author.setBooks(books);
        authorRepo.save(author);

        Author savedAuthor=authorRepo.findById(1).get();
        System.out.println(savedAuthor.getBooks());
    }
}
