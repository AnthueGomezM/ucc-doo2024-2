/*==============================================================*/
/* DBMS name:      PostgreSQL 9.x                               */
/* Created on:     13/09/2024 3:35:34 p. m.                     */
/*==============================================================*/


drop table APUESTAS;

drop table LOTERIAS;

drop table NUMEROS_APOSTADOS;

drop table USUARIOS;

/*==============================================================*/
/* Table: APUESTAS                                              */
/*==============================================================*/
create table APUESTAS (
   APUESTA_ID           NUMERIC              not null,
   USUARIO_ID           NUMERIC              null,
   FECHA_APUESTA        DATE                 null,
   MODNTO_APOSTADO      DECIMAL(20,2)        null,
   constraint PK_APUESTAS primary key (APUESTA_ID)
);

/*==============================================================*/
/* Table: LOTERIAS                                              */
/*==============================================================*/
create table LOTERIAS (
   LOTERIA_ID           NUMERIC              not null,
   NOMBRE               VARCHAR(20)          null,
   FECHA_SORTEO         DATE                 null,
   constraint PK_LOTERIAS primary key (LOTERIA_ID)
);

/*==============================================================*/
/* Table: NUMEROS_APOSTADOS                                     */
/*==============================================================*/
create table NUMEROS_APOSTADOS (
   APOSTADO_ID          NUMERIC              not null,
   APUESTA_ID           NUMERIC              null,
   LOTERIA_ID           NUMERIC              null,
   NUMERO               NUMERIC              null,
   constraint PK_NUMEROS_APOSTADOS primary key (APOSTADO_ID)
);

/*==============================================================*/
/* Table: USUARIOS                                              */
/*==============================================================*/
create table USUARIOS (
   USUARIO_ID           NUMERIC              not null,
   APUESTA_ID           NUMERIC              null,
   NOMBRE               VARCHAR(20)          null,
   CORREO               VARCHAR(20)          null,
   FECHA_REGISTRO       DATE                 null,
   constraint PK_USUARIOS primary key (USUARIO_ID)
);

alter table NUMEROS_APOSTADOS
   add constraint FK_NUMEROS__RF_LOTERIAS foreign key (LOTERIA_ID)
      references LOTERIAS (LOTERIA_ID)
      on delete restrict on update restrict;

alter table NUMEROS_APOSTADOS
   add constraint FK_NUMEROS__RF_APUESTAS foreign key (APUESTA_ID)
      references APUESTAS (APUESTA_ID)
      on delete restrict on update restrict;

alter table USUARIOS
   add constraint FK_USUARIOS_RF_APUESTAS foreign key (APUESTA_ID)
      references APUESTAS (APUESTA_ID)
      on delete restrict on update restrict;

