package com.prabhakar.carrierguidanceapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Map;

public class After10thActivity extends AppCompatActivity {

    private final Map<String, String> courses = Map.of(
            "Diploma in Engineering (Polytechnic)", "Diploma in Engineering, commonly known as Polytechnic, is a 3-year technical course that students can pursue after completing their 10th standard. It focuses on practical, skill-based training in various engineering fields like Mechanical, Civil, Computer, Electrical, Electronics, and Information Technology. This job-oriented program equips students with industry-relevant skills and offers direct employment opportunities in both public and private sectors. Diploma holders can also opt for lateral entry into the second year of B.E./B.Tech programs. It is an affordable, hands-on course ideal for students aiming for early career opportunities in engineering and technical industries.",
            "ITI – Electrician, Fitter, Mechanic", "ITI (Industrial Training Institute) courses like Electrician, Fitter, and Mechanic are skill-based, job-oriented training programs available after 10th standard. These courses typically last 6 months to 2 years and are designed to develop practical skills needed in industries and technical fields. The Electrician trade covers electrical wiring, equipment maintenance, and installation work, while Fitter focuses on assembling and fitting mechanical parts, machinery, and structures. The Mechanic trade trains students in repairing and maintaining vehicles, machines, and industrial equipment. ITI courses are ideal for students looking for quick employment opportunities in workshops, factories, service centers, and government sectors, with many graduates securing technician and apprentice roles in reputed industries.",
            "Paramedical – DMLT, ANM, GNM", "Paramedical courses like DMLT (Diploma in Medical Laboratory Technology), ANM (Auxiliary Nurse Midwifery), and GNM (General Nursing and Midwifery) are healthcare-related diploma programs available after the 10th or 12th standard, aimed at preparing students for supportive roles in hospitals, clinics, and diagnostic centers. DMLT focuses on laboratory tests, sample collection, and medical reporting, while ANM trains students in basic nursing, midwifery, and patient care, especially for maternal and child health. GNM is a more advanced course covering general nursing, emergency care, and hospital management, qualifying students to work as registered nurses. These paramedical courses offer excellent career opportunities in the healthcare sector, providing essential services alongside doctors and medical staff.",
            "Fashion Designing", "Fashion Designing is a creative and skill-based course that focuses on clothing design, fabric selection, color combinations, styling, and garment construction. Available after the 10th or 12th standard as a diploma or certificate course, it teaches students about fashion trends, pattern making, stitching techniques, and textile knowledge. This course is ideal for students with a passion for creativity, drawing, and styling, opening up career opportunities as fashion designers, boutique owners, stylists, merchandisers, and costume designers in the fashion, film, and retail industries. Fashion designing blends artistic talent with technical skills, offering a vibrant and growing career path for young, creative minds.",
            "Graphic & Web Design", "Graphic & Web Design is a creative, technology-driven course that teaches students how to design visually appealing graphics, logos, posters, websites, and digital content using tools like Photoshop, Illustrator, and web technologies like HTML, CSS, and JavaScript. Available as a diploma or certificate program after the 10th or 12th, it focuses on layout design, typography, user interface (UI), and user experience (UX) principles. This course is ideal for students with artistic skills and an interest in digital media, offering career opportunities as graphic designers, web designers, UI/UX designers, and freelancers in advertising agencies, IT companies, and media houses, blending creativity with modern technology.",
            "Data Entry & Computer Courses", "Data Entry & Computer Courses are short-term, skill-based programs available after the 10th or 12th standard that focus on basic computer knowledge, typing speed, data management, and office software like MS Word, Excel, and PowerPoint. These courses train students in handling digital records, creating documents, spreadsheets, and using internet tools effectively. Ideal for students seeking quick job opportunities in offices, banks, and private firms, these courses open up roles like data entry operators, office assistants, and clerks, providing essential digital skills required in almost every industry today."
    );


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after10th);

        setTitle("After 10th Options");

        RecyclerView recyclerView = findViewById(R.id.recyclerAfter10th);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setAdapter(new CourseMapAdapter(courses, course -> {
//            Toast.makeText(this, "Selected: " + course, Toast.LENGTH_SHORT).show();
//        }));
////        recyclerView.setAdapter(adapter);

        recyclerView.setAdapter(new CourseMapAdapter(courses));

    }
}