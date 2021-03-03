package ru.ekhart86.views.themes;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("solar")
public class SolarSystemTheme extends Div implements ComponentFactory {
    String imagePath = "images/solar.jpg";
    String imageAlt = "Фото космоса";
    String topicName = "The Solar Empire";
    String body = "The Solar system is the place where we live. It contains the central star, which is called the Sun, nine planets with their own satellites, many comets, billions meteorites and thousands asteroids.";
    String body1 = "The closest planet to the Sun is Mercury. Mercury is hard to see from the Earth because it is so small and so close to the sun. At certain times of the year, it can be seen just after sunset or before sunrise. The rest of the time it is lost in the sun's glare. Mean distance from the Sun is 58,000,000 km. Mercury's diameter is 4880 km. The surface temperature of Mercury can rise up to 800 Р during the day and can fall up to -360 F during the night. Because of such difference in day and night temperatures there is no atmosphere. It is the Bible Hell. The year on Mercury lasts 88 days.";
    String body2 = "The second planet from the Sun is Venus. Venus, the brightest object in the sky except for the Sun and the Moon, is often visible for several hours just after sunset or before sunrise. The entire planet is covered by thick clouds. The planet is dead because of huge greenhouse effect. The temperature under clouds can rise up to 900 F. There is no day and night because of thick clouds, covering Venus's sky. Venus* diameter is 12 100 km. The year on Venus lasts 226 days. Both Venus and Mercury have no satellites.";
    String body3 = "Our planet is the third planet from the Sun. Its diameter is 12j 760 km. Mean distance from the Sun is 150 millions of kilometres. The only natural satellite, orbiting the Earth is the Moon.\n" +
            "The Moon is the closest astronomical body to the Earth and we know more about it than about any other object in the heavens. Many surface features are visible to the unaided eye on the Moon, and a pair of binoculars reveals a great amount of detail. A small telescope shows vast seas of lava, large mountain ranges and hundreds of craters of all sizes. Mean distance from the Earth to the Moon is 384,400 km. The surface temperature of Moon can rise up to 248 F during the day and can fall up to -274 F during the night. The Moon's diameter is 3476 km. Its mass is about 85 times smaller that the Earth mass.";
    String body4 = "Mars is the fourth planet from the Sun. It is about twice smaller than the Earth. Its diameter is 6,800 km. The year on Mars lasts 686 days. Mars appears reddish in our sky, even to the naked eye. This is caused by the rich content of rust (iron oxide) in the top soil. Mars has two small moons: Phobos and Deimos. Mean distance from the Sun is 228,000,000 km. Its surface temperature varies from 72 F to -271 F.";
    String body5 = "The fifth planet from the Sun is Jupiter. Jupiter is the Solar System's largest planet. Its composition is more like a star than a planet. Jupiter's diameter is 143,800 km. The Jupiter year is 11 years, 321 days long. Mean distance from the Sun is 778,000,000 km. Jupiter belongs to outer giant planets of the Solar System. Jupiter has 39 moons.";
    String body6 = "The sixth planet from the Sun is Saturn. Mean distance from the Sun is about one billion and a half kilometres. Its beauty in even small telescopes is breathtaking. This planet has rings. The rings consist of billions of particles, ranging from a few centimetres to a few meters in diameter. The sixth planet has about 30 moons.";
    String body7 = "Uranus is the seventh planet from the Sun. The planet has a system of at least nine rings. Both Uranus and Saturn belong to giant planets. Uranus year is 84.01 years long, because the mean distance from the Sun is 2,870,000,000 km. Uranus has 21 satellites.";
    String body8 = "Neptune is the eighth planet from the Sun. It is the last giant planet of the Solar System. It is similar in size, and composition to Uranus. The year on Neptune lasts about 165 years, because the average distance from the Sun is 5 billions and a half kilometres. Neptune has 14 satellites.";
    String body9 = "Pluto is the farthest planet from the Sun. The mean distance from the Sun is nearly 6 billion kilometres. Pluto is smal-s ler than the Moon. It is the only planet that has not been visited by a spacecraft. It has the only one known moon Charon.";

    public SolarSystemTheme() {
        add(createHeaderContentBackToThemes("themes", topicName));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(createH3Header(topicName));
        verticalLayout.addAndExpand(createImage(imagePath, imageAlt));
        verticalLayout.addAndExpand(createBody(body));
        verticalLayout.addAndExpand(createBody(body1));
        verticalLayout.addAndExpand(createBody(body2));
        verticalLayout.addAndExpand(createBody(body3));
        verticalLayout.addAndExpand(createBody(body4));
        verticalLayout.addAndExpand(createBody(body5));
        verticalLayout.addAndExpand(createBody(body6));
        verticalLayout.addAndExpand(createBody(body7));
        verticalLayout.addAndExpand(createBody(body8));
        verticalLayout.addAndExpand(createBody(body9));
        add(verticalLayout);
    }
}