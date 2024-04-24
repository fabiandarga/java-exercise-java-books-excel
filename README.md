# Reading from an Excel File

Use the file under data/example.xsls

It looks something like this:  

| Title      | Author       | Pages |
|------------|--------------|-------|
|  Some book | Some author  | 100   |


## Task 1
Open and read the xsls file as a XSSFWorkbook.
Print out each book's name and author on the command line.

## Task 2
Create a Java Class **Book** with the fields *title, author and pages*.
Collect the data of all books in an Array of Books.
Then filter the array and only print out all books with more than 500 Pages in the form of:
Title (Pages)
e.g. "Some book (100)"

## Task 3
Calculate the sum of all pages and print it to the command line

## Task 4: Extra
Write new books into the file.
Check out if you find some interesting Java books and add some to the file with your code.
! Attention: Make sure, that a book is not added twice, when you start the program again.