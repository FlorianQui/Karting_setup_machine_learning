package com.karting;

import com.google.gson.*;

import javax.swing.*;
import java.util.Date;

public class Setup {

    private JButton button1;
    private JTextField textField1;

    public double getChrono() {
        return chrono;
    }

    public void setChrono(double chrono) {
        this.chrono = chrono;
    }

    public Circuit getCircuit() {
        return circuit;
    }

    public void setCircuit(Circuit circuit) {
        this.circuit = circuit;
    }

    public Pilote getPilote() {
        return pilote;
    }

    public void setPilote(Pilote pilote) {
        this.pilote = pilote;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    public Moteur getMoteur() {
        return moteur;
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }

    public Meteo getMeteo() {
        return meteo;
    }

    public void setMeteo(Meteo meteo) {
        this.meteo = meteo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public enum BARRE_AVANT { Plate, Ronde }
    public enum JANTE { Standard, Magnesium }
    public enum METEO_TEMPS { Sec, Pluie }

    public class Pilote
    {
        private String nom;
        private String prenom;
        private String licence;

        public Pilote(){
            nom = new String();
            prenom = new String();
            licence = new String();
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public String getLicence() {
            return licence;
        }

        public void setLicence(String licence) {
            this.licence = licence;
        }
    }

    public class Circuit
    {
        private String nom;

        public Circuit(){
            nom = new String();
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }
    }

    public class Axle
    {
        private double hauteur;
        private double largeur;

        public Axle(){
            hauteur = 0;
            largeur = 0;
        }

        public double getHauteur() {
            return hauteur;
        }

        public void setHauteur(double hauteur) {
            this.hauteur = hauteur;
        }

        public double getLargeur() {
            return largeur;
        }

        public void setLargeur(double largeur) {
            this.largeur = largeur;
        }
    }

    public class Pression
    {
        private double avg;
        private double avd;
        private double arg;
        private double ard;

        public Pression(){
            avg = 0;
            avd = 0;
            arg = 0;
            ard = 0;
        }

        public double getAvg() {
            return avg;
        }

        public void setAvg(double avg) {
            this.avg = avg;
        }

        public double getAvd() {
            return avd;
        }

        public void setAvd(double avd) {
            this.avd = avd;
        }

        public double getArg() {
            return arg;
        }

        public void setArg(double arg) {
            this.arg = arg;
        }

        public double getArd() {
            return ard;
        }

        public void setArd(double ard) {
            this.ard = ard;
        }
    }

    public class Chassis
    {
        private String marque;
        private String modele;
        private String chassis_number;
        private Axle train_avant;
        private Axle train_arriere;
        private BARRE_AVANT barre_avant;
        private JANTE jante;
        Pression pression;
        private double carrossage;
        private double chasse;

        public Chassis(){
            marque = new String();
            modele = new String();
            chassis_number = new String();
            train_avant = new Axle();
            train_arriere = new Axle();
            barre_avant = null;
            jante = null;
            pression = new Pression();
            carrossage = 0;
            chasse = 0;
        }

        public String getMarque() {
            return marque;
        }

        public void setMarque(String marque) {
            this.marque = marque;
        }

        public String getModele() {
            return modele;
        }

        public void setModele(String modele) {
            this.modele = modele;
        }

        public String getChassis_number() {
            return chassis_number;
        }

        public void setChassis_number(String chassis_number) {
            this.chassis_number = chassis_number;
        }

        public Axle getTrain_avant() {
            return train_avant;
        }

        public void setTrain_avant(Axle train_avant) {
            this.train_avant = train_avant;
        }

        public Axle getTrain_arriere() {
            return train_arriere;
        }

        public void setTrain_arriere(Axle train_arriere) {
            this.train_arriere = train_arriere;
        }

        public BARRE_AVANT getBarre_avant() {
            return barre_avant;
        }

        public void setBarre_avant(BARRE_AVANT barre_avant) {
            this.barre_avant = barre_avant;
        }

        public JANTE getJante() {
            return jante;
        }

        public void setJante(JANTE jante) {
            this.jante = jante;
        }

        public double getCarrossage() {
            return carrossage;
        }

        public void setCarrossage(double carrossage) {
            this.carrossage = carrossage;
        }

        public double getChasse() {
            return chasse;
        }

        public void setChasse(double chasse) {
            this.chasse = chasse;
        }
    }

    public class Aiguille
    {
        private String type;
        private double hauteur;

        public Aiguille(){
            type = new String();
            hauteur = 0;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public double getHauteur() {
            return hauteur;
        }

        public void setHauteur(double hauteur) {
            this.hauteur = hauteur;
        }
    }

    public class Gicleur
    {
        private double principal;
        private double ralenti;

        public Gicleur(){
            principal = 0;
            ralenti = 0;
        }

        public double getPrincipal() {
            return principal;
        }

        public void setPrincipal(double principal) {
            this.principal = principal;
        }

        public double getRalenti() {
            return ralenti;
        }

        public void setRalenti(double ralenti) {
            this.ralenti = ralenti;
        }
    }

    public class Carbu
    {
        private Aiguille aiguille;
        private String boisseau;
        private Gicleur gicleur;
        private String puit;
        private String emulseur;

        public Carbu(){
            aiguille = new Aiguille();
            boisseau = new String();
            gicleur = new Gicleur();
            puit = new String();
            emulseur = new String();
        }

        public Aiguille getAiguille() {
            return aiguille;
        }

        public void setAiguille(Aiguille aiguille) {
            this.aiguille = aiguille;
        }

        public String getBoisseau() {
            return boisseau;
        }

        public void setBoisseau(String boisseau) {
            this.boisseau = boisseau;
        }

        public Gicleur getGicleur() {
            return gicleur;
        }

        public void setGicleur(Gicleur gicleur) {
            this.gicleur = gicleur;
        }

        public String getPuit() {
            return puit;
        }

        public void setPuit(String puit) {
            this.puit = puit;
        }

        public String getEmulseur() {
            return emulseur;
        }

        public void setEmulseur(String emulseur) {
            this.emulseur = emulseur;
        }
    }

    public class Transmission
    {
        private double pignon;
        private double courronne;

        public Transmission(){
            pignon = 0;
            courronne = 0;
        }

        public double getPignon() {
            return pignon;
        }

        public void setPignon(double pignon) {
            this.pignon = pignon;
        }

        public double getCourronne() {
            return courronne;
        }

        public void setCourronne(double courronne) {
            this.courronne = courronne;
        }
    }

    public class Moteur
    {
        private String marque;
        private String modele;
        private String motor_number;
        private Transmission transmission;
        private Carbu carbu;

        public Moteur(){
            marque = new String();
            modele = new String();
            motor_number = new String();
            transmission = new Transmission();
            carbu = new Carbu();
        }

        public String getMarque() {
            return marque;
        }

        public void setMarque(String marque) {
            this.marque = marque;
        }

        public String getModele() {
            return modele;
        }

        public void setModele(String modele) {
            this.modele = modele;
        }

        public String getMotor_number() {
            return motor_number;
        }

        public void setMotor_number(String motor_number) {
            this.motor_number = motor_number;
        }

        public Transmission getTransmission() {
            return transmission;
        }

        public void setTransmission(Transmission transmission) {
            this.transmission = transmission;
        }

        public Carbu getCarbu() {
            return carbu;
        }

        public void setCarbu(Carbu carbu) {
            this.carbu = carbu;
        }
    }

    public class Meteo
    {
        private METEO_TEMPS temps;
        private double temperature;
        private double pression;
        private double humidite;

        public Meteo(){
            temps = null;
            temperature = 0;
            pression = 0;
            humidite = 0;
        }

        public METEO_TEMPS getTemps() {
            return temps;
        }

        public void setTemps(METEO_TEMPS temps) {
            this.temps = temps;
        }

        public double getTemperature() {
            return temperature;
        }

        public void setTemperature(double temperature) {
            this.temperature = temperature;
        }

        public double getPression() {
            return pression;
        }

        public void setPression(double pression) {
            this.pression = pression;
        }

        public double getHumidite() {
            return humidite;
        }

        public void setHumidite(double humidite) {
            this.humidite = humidite;
        }
    }

    private Circuit circuit;
    private Pilote pilote;
    private Chassis chassis;
    private Moteur moteur;
    private Meteo meteo;
    private Date date;
    private double chrono;

    public Setup(){
        setCircuit(new Circuit());
        setPilote(new Pilote());
        setChassis(new Chassis());
        setMoteur(new Moteur());
        setMeteo(new Meteo());
        setDate(new Date());
        setChrono(0);
    }

    @Override
    public String toString() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);
    }
}

