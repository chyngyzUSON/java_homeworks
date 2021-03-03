--Home Work 036
select *
from customer
where country in ('Spain', 'Italy', 'Germany', 'France')
order by country; 

select *
from customer
where first_name like 'Jo%';

select *
from customer
where first_name like '___a';

select customer.country count(id) as "Количество клиентов по странам" 
from customer;
group by customer.country 



 

select country 
from customer
group by country 
order by country 

select count(id) as "Количество заказов"
from orders;

select max(total_amount) as "Максимальная стоимость зааказов"
from orders;

select sum(total_amount) as "Сумма всех заказов"
from orders;

select sum(total_amount) as "Сумма всех заказов за 2014г"
from orders
where extract (year from order_date) = 2014;

select round(avg(total_amount), 2) as "Средняя стоимость всех заказов"
from orders;

select o.customer_id, c.first_name, c.last_name, avg(o.total_amount) as "Ср.стоимость заказов по клиенту" --5
from orders o --1
join customer c on c.id = o.customer_id --2
--where first_name = 'Paul' --3
group by o.customer_id, c.first_name, c.last_name --4
having avg(o.total_amount) < 1000 --6
order by c.first_name; --7

select * 
from customer
where country = 'Brasil' or country = 'Spain';

select *
from customer
where country in ('Brazil', 'Spain');

select *
from orders
where extract (year from order_date) between 2013 and 2014
	and total_amount < 100
	
select distinct c.country --Найти все страны клиентов, страны которых содержаться в таблице поставщиков
from customer c
join supplier s on s.country = c.country 


select o.id order_id, c.first_name, c.last_name, c.city, p.product_name, p.unit_price, s.company_name
from orders o 
join customer c on c.id = o.customer_id 
join order_item oi on oi.order_id = o.id 
join product p on p.id = oi.product_id 
join supplier s on s.id = p.supplier_id 








