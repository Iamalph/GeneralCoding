# Open Source Collaboration

## Sections 
- [Headers](#header)
- [Quotes](#quotes)
- [Emphasis](#emphasis)
- [Horizontal-Rule](#horizontal-rule)
- [Lists](#lists)
- [Links](#links)
- [Images](#images)

# Header
Headers are defined by the '#' symbol. One '#' for H1, two for H2, etc

>  **TODO**. Create an H1

# Header 1
>  **TODO**. Create an H2

## Header 2

>  **TODO**. Create an H3

### Header 3

>  **TODO**. Create an H4

#### Header 4

# Quotes

Quotes are defined by the '>' symbol

> **TODO**. Create a quote

> This is a quote

You can combine a header with a quote

> **TODO** Create an H2 Quote

> ## Hi this is H2 Quote

> **TODO** Create an H1 Quote

> # Hi this is H1 Quote

___

## Emphasis

Add emphasis with astrisks '*' and underscores '_' 
Two before and after (no spaces) a section of texts makes it bold.


<!-- 
Example 

**Bold Text with asterisks**
__Bold Text with underscores__

 -->

 **Bold Sentence**

 __Bold with italics__


 One before and after (no spaces ) a section of texts makes it bold

 <!-- 
 *Italicized Text with asterisks*
 _Italicized Text with underscores_
 
  -->

*Italic sentence*

_Italics sentence_


You can also put Bold and Italicized text inline by surrounding a group of words.

<!-- 
Example 

This text is **bold** and this text is *italicized*


 -->

 > **TODO**. Create a bold sentence, an italicized sentence, and a sentence with both bold and italicized text inline.

 **Hi this is bold sentence**

 *Hi this is italicized sentence*

 Hi this sentence containse both **bold**
 and *italicized* sentences.

 ___

 ## Horizontal Rule

 A horizontal rule gives a visible line break. You can create one by putting three or more hypens, astrisks, or underscores(-,*,_).

 For what it's worth, I prefer dashes...

 <!-- 
Example

---

***
___

  -->

> **TODO**. Create a horizontal rule

---

***
___

## Lists

Create unordered lists using '-','*','+'

<!-- 

- item
* item
+ item
- sdfsd

 -->

 - Item
 - Another item
 - Another Another item
 * Asterisk item
 + plus Item

 You can create sublists by indenting 

 <!-- 
 Example 
 
 -item
 -subitem

  -->

- list
    - sublist1
        - sublist2



Create ordered lists using a number prefix


<!-- 
Example 

1. item 1
2. item 2
3. item 3


 -->

 1. Item1
 2. Item2
 3. Item3
 1. Item4
 <!--
   it just needs a number insted of 4 you can write 1. and it will automatically make it 4  
-->


> **TODO** Create an unordered list of your 5 favorite TV Shows

- list of movies
    - liked
        - tere name
        - kalia
        - sazam
    - disliked
        - mrc
        - dr p
        - dp c
---
> **TODO** Create an ordered list of your top 5 Movies.

1. list of top 5 movies
    1. MVC PART1
    2. MVC PART2
    3. MVC PART3

---

## Links

Create a link by surrounding it with angle bracket.

<!-- 
EXAMPLE :

<http://www.jamesqquick.com>

 -->

 <http://www.google.com>

Create a link with text by surrounding text with brackets, [], and link immediately following with parenthesis ()

<!-- 
Example 

[James Q Quick](http://www.jamesqquick.com)

 -->

[Google](http://www.google.com)

> **TODO**. Create a link to your website, twitter, or github, with no text

<http://www.deshmukhsomesh.com>

<http://www.github.com>

<http://www.twitter.com>

> **TODO**. Create a link with text to your website, twitter, or github

[Twitter](http://www.twitter.com)
[Website](http://www.deshmukhsomesh.com)
[Github](http://www.github.com)



What if you need to reuse a link several times? Well, you could copy and paste that link each  time. That means, if you need to update the link , you will have to do it each tiem its used. There's a better way!

<!-- 

Example:

[1] : http://jamesqquick.com

 -->

 [key]: http://www.google.com

Then use the reference style link by suing your text inside of brackets followed by the link 'key' inside of bracket.

 <!-- 
 Example 
 
 [My Website] [1]
  
  -->

[My Website][key]

> **TODO** Create a reference link to your website and referrence it three times:



[Github1]: http://google.com

[gitlink][Github1]
[gitlink1][Github1]
[gitlink2][Github1]


You can also link to other locations on your markdown page. remember, your MarkDown will get converted to HTML, so you can, in theory, use a anchor tag to link to an element with a specific ID. You can find an example of this in the list of secitons at athe top of this document.


When we create a header tag for example, it implicitly creates an id property.

Ex: '# Header' becomes `<h1 id= "header">Header</h1>`

Names will be converted to ids by replacing spaces with hyphens and uppercase letters with lowercase letters (think css naming convention).

Ex : 'Header Info' becomes header-info

Header Info -> header-info
> **TODO** Create a link to another part of your page


[Links](#links)

## Images

Defining an image is similar to defining a link, except you prefix it with '!'

<!-- 
Example:

[profile]:
https:some link.jpg

 -->

![profile](resume.jpg)

Just like links, you an define images by reference in the same format.
Define the reference

you can also use keys

<!-- 

Example:

[profile]:resume.jpg

 -->
 [profile]:resume.jpg

 Use the reference

 <!-- 
 Example ![James Quick][profile]

  -->

![somesh deshmukh][profile]


> **TODO** Create a reference link to your profile picture and then reference it.

[profile1]:https://yt3.ggpht.com/IYDWYbRXDQLMFCBuNEP2ISnPIXgXn2BZ91RX6BJ44i5o5QTF3Jj_4yNpTCthGxEOic2AVQilYMI=s88-c-k-c0x00ffffff-no-rj-mo

![madcoding][profile1]

---

## Code

You can do inline code with `backticks` (``)

> **TODO**. Display a line of text with inline code

Here is some code inline `var item  = {};`

You can do blocks of code by surrounding it with 3 backticks (``` ```)


```
var item = {};
item.something = "something";
 ```

 <!-- 
 ```
var num = 0;
var num2 = 0;

 ```
 
  -->

> **TODO**  Display a block of code from your favorite language

The above does not give language specific highlighting. You can specify the programming langueage immediatly follwoing the opening 3 backticks. You should see a difference in highliting !

<!-- 
Example Javascirpt
```javascript
var num=0;
var num2=0;
```
 -->

```javascript
    var num=0;
    var num2=0; 
  ```


<!-- 
Example HTML

```html
<div>
<p>This is an html example</p>
</div>
```
 -->

 ```html
    <div>
        <p>This is an html example</p>
        </div>
  ```

> **TODO** Display a block of code from your favorite language while specifing the language



```java
    System.out.println("Deshmukh");
```

---

## Tables
Tables are useful for displaying rows and columns of data. Column headers can be defined in between pipes (|). Headers are separated from table content with a row of dashes(-) (still separated by pipes), and there must be at least 3 dashes between each headers. The row data follows beneath (still separated by pipes);

<!-- 
Example:
| Header 1 | Header 2 | Header 3|
|----------| --------| ---------|
| Row 1 Col 1| Row 1 Col 2 | Row 1 Col 3|

-->

| Header 1 | Header 2 | Header 3|
|---|---|---|
| Column 1 | Column 2 | Column 3|
| Column 1 | Column 2 | Column 3|
| Column 1 | Column 2 | Column 3|

The column definations and row definations do not have to have the exact same width size , but it would be much more readable. Notice the output of the following two tables are the same, but the second ( the raw markdown) is much more readable.

<!-- 
Example

| Header 1 | Header 2 |
|---|---|
| Loooooooooooooooooong item 1 | looooooooooooooog item 2 |


 -->

 <!-- here some part has been skipped. -->

 > **TODO**. Create a table with three columns, one aligned left, one aligned center, and one aligned right.

 | Header | Header 1 | Header 2 |
 |:--------| :-------: | ------: |
 |Aligned Left | Aligned Center | Aligned Right |


 ---

 ## Custom HTML

 Since MarkDown gets automatically converted to HTML, you can add raw HTML directly to your MarkDown.


 ```html
 <p> Sample HTML Div</p>
 ```


 creates this 
 <p> Sample HTML Div</p>

 > **TODO** If you are comfortable with HTMl, add some raw HTML.


 <h1> Header 1</h1>

 # Header 1

 ---

 ## Custom CSS

 You can also add custom CSS to your MarkDown to add additional styling to your document. You can also include CSS by including a style tag.

 ```html
      <style>
        body{
          color:red;
        }
        </style>
 ```

 <style>
  p{
    /* color:red; */
  }
 </style>

 