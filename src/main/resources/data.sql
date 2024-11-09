-- Insert books
-- Insert data into the Book table
INSERT INTO book (title, author, genre) VALUES ('The Great Gatsby', 'F. Scott Fitzgerald', 'Fiction');
INSERT INTO book (title, author, genre) VALUES ('To Kill a Mockingbird', 'Harper Lee', 'Fiction');
INSERT INTO book (title, author, genre) VALUES ('1984', 'George Orwell', 'Dystopian');
INSERT INTO book (title, author, genre) VALUES ('Pride and Prejudice', 'Jane Austen', 'Classic');

-- Insert chapters for The Great Gatsby
INSERT INTO chapter ( name, book_id) VALUES ( 'Chapter 1', 1);
INSERT INTO chapter ( name, book_id) VALUES ( 'Chapter 2', 1);

-- Insert chapters for To Kill a Mockingbird
INSERT INTO chapter ( name, book_id) VALUES ( 'Chapter 1', 2);
INSERT INTO chapter ( name, book_id) VALUES ( 'Chapter 2', 2);
