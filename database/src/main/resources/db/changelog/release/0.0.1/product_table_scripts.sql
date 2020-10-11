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

create table Product
(
	Prod_id	    BIGSERIAL,
	App_id		bigint,
	Prod_code	varchar(20),
	Prod_Name	varchar(200),
	Prod_Type	varchar(100),
	prod_category varchar(100),
	Isactive	boolean,
	CreatedBy	Varchar(50),
	CreatedOn	date,
	UpdatedBy	Varchar(50),
	UpdatedOn	date
);

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

create table Prod_Color
(
	Color_id	BIGSERIAL,
	Color		varchar(15),
	CreatedBy	Varchar(50),
	CreatedOn	date,
	UpdatedBy	Varchar(50),
	UpdatedOn	date
);

create table Prod_Fragnance
(
	Fragnance_id	bigserial,
	Fragnance	varchar(15),
	CreatedBy	Varchar(50),
	CreatedOn	date,
	UpdatedBy	Varchar(50),
	UpdatedOn	date
);

create table Prod_Size
(
	Size_id	        bigserial,
	Size		varchar(15),
	CreatedBy	Varchar(50),
	CreatedOn	date,
	UpdatedBy	Varchar(50),
	UpdatedOn	date
);

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

create table Prod_Purity
(
	Purity_id	bigserial,
	Purity		varchar(100),
	CreatedBy	Varchar(50),
	CreatedOn	date,
	UpdatedBy	Varchar(50),
	UpdatedOn	date
);

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

create table Prod_Desc
(
	Desc_id	        bigserial,
	Prod_Desc	varchar(2000),
	CreatedBy	Varchar(50),
	CreatedOn	date,
	UpdatedBy	Varchar(50),
	UpdatedOn	date
);

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