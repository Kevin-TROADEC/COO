// prototype contenant les méthodes communes aux objets Voiture, avec une méthode clone et une méthode afficher générique
const prototypeVoiture = {
    name: 'prototype',
    options: [],
    afficher() {
        console.log(this.name + " :");
        console.log("Options: " + this.options.join(', ') + "\n");
    },

    clone() {
        return Object.create(this);
    }
}

// Création des objets Voiture à partir du prototype
const voitureSt = {
    __proto__: prototypeVoiture,
}

const voitureFam = {
    __proto__: prototypeVoiture,
    
}

const voitureSp = {
    __proto__: prototypeVoiture,
    
}

// Ajout des propriétés spécifiques à chaque objet Voiture
voitureSt.name = 'Voiture standarde';
voitureSt.options = ['Radio', 'Téléphone'];
voitureFam.name = 'Voiture familiale';
voitureFam.options = ['Siège enfant', 'Miroir'];
voitureSp.name = 'Voiture sportive';
voitureSp.options = ['Suspensions', 'Jantes'];

// Affichage des objets Voiture
voitureSt.afficher();
voitureFam.afficher();
voitureSp.afficher();

// Clonage de l'objet Voiture standarde
const voitureSt2 = voitureSt.clone();
voitureSt2.name = 'Voiture standarde 2';
// Ajout d'une option à l'objet cloné
voitureSt2.options.push('Climatisation');
// Affichage de l'objet cloné
voitureSt2.afficher();

//console.log(Object.getPrototypeOf(voitureSt2));