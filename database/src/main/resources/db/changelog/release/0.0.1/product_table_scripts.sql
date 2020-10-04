DO
$do$
Begin
	
	If EXISTS (select count(*)  from pg_tables where tablename = upper('Application')) Then
		drop table Application;
	else
		null;
	end if;
	
end;
$do$
;
create table Application
(
	App_id	    BIGSERIAL,
	App_Name	varchar(200),
	App_Type	varchar(100),
	Isactive	boolean,
	CreatedBy	Varchar(50),
	CreatedOn	date,
	UpdatedBy	Varchar(50),
	UpdatedOn	date
);

DO
$do$
Begin
	
	If EXISTS (select count(*)  from pg_tables where tablename = upper('Product')) Then
		drop table Product;
	end if;
	
end;
$do$
;

create table Product
(
	Prod_id	    BIGSERIAL,
	App_id		bigint,
	Prod_code	varchar(20),
	Prod_Name	varchar(200),
	Prod_Type	varchar(100),
	Isactive	boolean,
	CreatedBy	Varchar(50),
	CreatedOn	date,
	UpdatedBy	Varchar(50),
	UpdatedOn	date
);

DO
$do$
Begin
	
	If EXISTS (select count(*)  from pg_tables where tablename = upper('Prod_Weight')) Then
		drop table Prod_Weight;
	end if;
	
end;
$do$
;

create table Prod_Weight
(
	Weight_id	BIGSERIAL,
	weight		int,
	Unit		varchar(10),
	CreatedBy	Varchar(50),
	CreatedOn	date,
	UpdatedBy	Varchar(50),
	UpdatedOn	date
);

DO
$do$
Begin
	
	If EXISTS (select count(*)  from pg_tables where tablename = upper('Prod_Color')) Then
		drop table Prod_Color;
	end if;
	
end;
$do$
;

create table Prod_Color
(
	Color_id	BIGSERIAL,
	Color		varchar(15),
	CreatedBy	Varchar(50),
	CreatedOn	date,
	UpdatedBy	Varchar(50),
	UpdatedOn	date
);

DO
$do$
Begin
	
	If EXISTS (select count(*)  from pg_tables where tablename = upper('Prod_Fragnance')) Then
		drop table Prod_Fragnance;
	end if;
	
end;
$do$
;

create table Prod_Fragnance
(
	Fragnance_id	bigserial,
	Fragnance	varchar(15),
	CreatedBy	Varchar(50),
	CreatedOn	date,
	UpdatedBy	Varchar(50),
	UpdatedOn	date
);

DO
$do$
Begin
	
	If EXISTS (select count(*)  from pg_tables where tablename = upper('Prod_Size')) Then
		drop table Prod_Size;
	end if;
	
end;
$do$
;

create table Prod_Size
(
	Size_id	        bigserial,
	Size		varchar(15),
	CreatedBy	Varchar(50),
	CreatedOn	date,
	UpdatedBy	Varchar(50),
	UpdatedOn	date
);

DO
$do$
Begin
	
	If EXISTS (select count(*)  from pg_tables where tablename = upper('Prod_Image')) Then
		drop table Prod_Image;
	end if;
	
end;
$do$
;

create table Prod_Image
(
	Image_id	bigserial,
	Image		BYTEA,
	Clarity		varchar(15),
	CreatedBy	Varchar(50),
	CreatedOn	date,
	UpdatedBy	Varchar(50),
	UpdatedOn	date
);

DO
$do$
Begin
	
	If EXISTS (select count(*)  from pg_tables where tablename = upper('Prod_Packaging')) Then
		drop table Prod_Packaging;
	end if;
	
end;
$do$
;

create table Prod_Packaging
(
	Packaging_id		bigserial,
	Package_Type		varchar(15),
	Package_size		varchar(15),
	Package_Material	varchar(100),
	CreatedBy		Varchar(50),
	CreatedOn		date,
	UpdatedBy		Varchar(50),
	UpdatedOn		date
);

DO
$do$
Begin
	
	If EXISTS (select count(*)  from pg_tables where tablename = upper('Prod_Ingradient')) Then
		drop table Prod_Ingradient;
	end if;
	
end;
$do$
;

create table Prod_Ingradient
(
	Ingradient_id	bigserial,
	Ingradient_Type	varchar(1000),
	Material		varchar(100),
	CreatedBy		Varchar(50),
	CreatedOn		date,
	UpdatedBy		Varchar(50),
	UpdatedOn		date
);

DO
$do$
Begin
	
	If EXISTS (select count(*)  from pg_tables where tablename = upper('Prod_Purity')) Then
		drop table Prod_Purity;
	end if;
	
end;
$do$
;

create table Prod_Purity
(
	Purity_id	bigserial,
	Purity		varchar(100),
	CreatedBy	Varchar(50),
	CreatedOn	date,
	UpdatedBy	Varchar(50),
	UpdatedOn	date
);

DO
$do$
Begin
	
	If EXISTS (select count(*)  from pg_tables where tablename = upper('Prod_Gender')) Then
		drop table Prod_Gender;
	end if;
	
end;
$do$
;

create table Prod_Gender
(
	Gender_id	bigserial,
	Gender		varchar(10),
	Age_Grp		varchar(20),
	CreatedBy	Varchar(50),
	CreatedOn	date,
	UpdatedBy	Varchar(50),
	UpdatedOn	date
);

DO
$do$
Begin
	
	If EXISTS (select count(*)  from pg_tables where tablename = upper('Prod_Desc')) Then
		drop table Prod_Desc;
	end if;
	
end;
$do$
;

create table Prod_Desc
(
	Desc_id	        bigserial,
	Prod_Desc	varchar(2000),
	CreatedBy	Varchar(50),
	CreatedOn	date,
	UpdatedBy	Varchar(50),
	UpdatedOn	date
);

DO
$do$
Begin
	
	If EXISTS (select count(*)  from pg_tables where tablename = upper('Product_Details')) Then
		drop table Product_Details;
	end if;
	
end;
$do$
;

create table Product_Details
(
	Prdtl_id	bigserial,
	App_id		bigint,
	Prod_id		bigint,
	Color_id	bigint,
	Fragnance_id	bigint,
	Size_id		bigint,
	Packaging_id	bigint,
	Ingradient_id	bigint,
	Purity_id	bigint,
	Gender_id	bigint,
	Desc_id		bigint,
	CreatedBy	Varchar(50),
	CreatedOn	date,
	UpdatedBy	Varchar(50),
	UpdatedOn	date
);

DO
$do$
Begin

	If EXISTS (select count(*)  from pg_tables where tablename = upper('featured_items')) Then
		drop table featured_items;
	end if;

end;
$do$
;

create table featured_items
(
	feature_id	        bigserial,
	feature_name Varchar(50),
	app_id	    bigint,
	product_id	bigint,
	is_active	boolean,
	CreatedBy	Varchar(50),
	CreatedOn	date,
	UpdatedBy	Varchar(50),
	UpdatedOn	date
);