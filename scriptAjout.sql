TRUNCATE TABLE COMMANDE;
TRUNCATE TABLE FOURNI;
TRUNCATE TABLE ARTICLE;
TRUNCATE TABLE FOURNISSEUR;

INSERT INTO UML.ARTICLE(NOM,QUANTITE,PRIX,CODEBARRE,SEUILDEREASSORTIMENT,TYPEDEVENTE) VALUES ('Celeron J1750',10,72,000000,5, FALSE);
INSERT INTO UML.ARTICLE(NOM,QUANTITE,PRIX,CODEBARRE,SEUILDEREASSORTIMENT,TYPEDEVENTE) VALUES ('Celeron J1800',14,72,000001,8, FALSE);
INSERT INTO UML.ARTICLE(NOM,QUANTITE,PRIX,CODEBARRE,SEUILDEREASSORTIMENT,TYPEDEVENTE) VALUES ('Celeron J1850',5,82,000010,10, FALSE);
INSERT INTO UML.ARTICLE(NOM,QUANTITE,PRIX,CODEBARRE,SEUILDEREASSORTIMENT,TYPEDEVENTE) VALUES ('Celeron J1900',10,82,000011,7, FALSE);
INSERT INTO UML.ARTICLE(NOM,QUANTITE,PRIX,CODEBARRE,SEUILDEREASSORTIMENT,TYPEDEVENTE) VALUES ('Celeron J2850',15,82,000100,10, FALSE);
INSERT INTO UML.ARTICLE(NOM,QUANTITE,PRIX,CODEBARRE,SEUILDEREASSORTIMENT,TYPEDEVENTE) VALUES ('Celeron J2900',20,94,000101,7, FALSE);
INSERT INTO UML.ARTICLE(NOM,QUANTITE,PRIX,CODEBARRE,SEUILDEREASSORTIMENT,TYPEDEVENTE) VALUES ('Celeron N2805',25,107,000110,20, FALSE);
INSERT INTO UML.ARTICLE(NOM,QUANTITE,PRIX,CODEBARRE,SEUILDEREASSORTIMENT,TYPEDEVENTE) VALUES ('Celeron N2806',20,107,000111,20, FALSE);
INSERT INTO UML.ARTICLE(NOM,QUANTITE,PRIX,CODEBARRE,SEUILDEREASSORTIMENT,TYPEDEVENTE) VALUES ('Celeron N2807',18,107,001000,15, FALSE);
INSERT INTO UML.ARTICLE(NOM,QUANTITE,PRIX,CODEBARRE,SEUILDEREASSORTIMENT,TYPEDEVENTE) VALUES ('Celeron N2808',19,107,001001,22, FALSE);
INSERT INTO UML.ARTICLE(NOM,QUANTITE,PRIX,CODEBARRE,SEUILDEREASSORTIMENT,TYPEDEVENTE) VALUES ('Celeron N2810',9,107,001010,13, FALSE);
INSERT INTO UML.ARTICLE(NOM,QUANTITE,PRIX,CODEBARRE,SEUILDEREASSORTIMENT,TYPEDEVENTE) VALUES ('Celeron N2815',15,107,001011,20, FALSE);

INSERT INTO UML.ARTICLE(NOM,QUANTITE,PRIX,CODEBARRE,SEUILDEREASSORTIMENT,TYPEDEVENTE) VALUES ('Athlon 5350',32,59,001100,18, FALSE);
INSERT INTO UML.ARTICLE(NOM,QUANTITE,PRIX,CODEBARRE,SEUILDEREASSORTIMENT,TYPEDEVENTE) VALUES ('Athlon 5150',24,49,001101,14, FALSE);
INSERT INTO UML.ARTICLE(NOM,QUANTITE,PRIX,CODEBARRE,SEUILDEREASSORTIMENT,TYPEDEVENTE) VALUES ('Sempron 3850',18,39,001110,13, FALSE);
INSERT INTO UML.ARTICLE(NOM,QUANTITE,PRIX,CODEBARRE,SEUILDEREASSORTIMENT,TYPEDEVENTE) VALUES ('Sempron 2650',13,34,001111,15, FALSE);

INSERT INTO UML.FOURNISSEUR(NOM,ADRESSE,CODEPOSTAL,NUMEROTELEPHONE) VALUES ('Intel','Santa Clara, California',95050,1234567890);
INSERT INTO UML.FOURNISSEUR(NOM,ADRESSE,CODEPOSTAL,NUMEROTELEPHONE) VALUES ('AMD','Sunnyvale, California',94085,1234567899);