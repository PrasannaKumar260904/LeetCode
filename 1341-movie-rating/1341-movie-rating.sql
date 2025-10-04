with temp1 as (
    # Write your MySQL query statement below
    SELECT a.user_id as u_id,
           a.name as u_name,
           count(b.user_id) as m_count
    from Users a
    join MovieRating b
    on a.user_id=b.user_id
    group by a.user_id
    order by m_count desc, a.name
    limit 1
),
    temp2 as (
    # Write your MySQL query statement below
    SELECT a.movie_id as m_id,
           a.title as m_title,
           avg(b.rating) as m_avg
    from Movies a
    join MovieRating b
    on a.movie_id=b.movie_id
    where b.created_at between '2020-02-01' and '2020-02-29'
    group by a.movie_id
    order by m_avg desc, a.title
    limit 1
) 
select temp1.u_name as results
from temp1
union all
select temp2.m_title as results
from temp2;

