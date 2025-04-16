package com.prabhakar.carrierguidanceapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Map;


public class After12thActivity extends AppCompatActivity {

    RecyclerView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after12th);

        setTitle("After 12th");

        listView = findViewById(R.id.recyclerViewAfter12th);


        Map<String, String> courses = Map.of(
                "Engineering (B.Tech, B.E.)", "Engineering (B.Tech, B.E.) is a professional 4-year undergraduate degree program pursued after completing the 12th standard with Science (PCM/PCB), focusing on the study and application of scientific, mathematical, and technical principles to design, build, and maintain machines, structures, systems, and processes. Offered in various branches like Mechanical, Civil, Computer, Electrical, Electronics, IT, and Automobile Engineering, this course combines theoretical knowledge with practical labs, projects, and internships. It prepares students for careers in industries like manufacturing, construction, software, telecom, automotive, and public sectors, while also offering options for higher studies, entrepreneurship, or government jobs, making it one of the most sought-after and respected career choices in India.",
                "Medical (MBBS, BDS, BHMS)", "Medical courses like MBBS, BDS, and BHMS are professional undergraduate programs pursued after the 12th standard with Science (PCB), focusing on the study of human health, medicine, and healthcare practices. MBBS (Bachelor of Medicine and Bachelor of Surgery) is a 5.5-year course that trains students to become doctors capable of diagnosing and treating illnesses. BDS (Bachelor of Dental Surgery) is a 5-year program specializing in dental health, oral surgery, and dentistry. BHMS (Bachelor of Homeopathic Medicine and Surgery) is a 5.5-year course focusing on homeopathic medical practices and natural healing. These courses open up careers as doctors, dentists, and homeopathic practitioners in hospitals, clinics, research, and healthcare institutions, offering prestigious, service-oriented, and high-responsibility professions.",
                "Commerce (B.Com, CA, CS)", "Commerce courses like B.Com, CA, and CS are popular undergraduate and professional programs pursued after the 12th standard with a commerce background, focusing on business, finance, law, and accounting. B.Com (Bachelor of Commerce) is a 3-year undergraduate degree that provides a solid foundation in subjects like accounting, economics, business law, and taxation, preparing students for careers in finance, accounting, banking, and business management. CA (Chartered Accountancy) is a professional course focused on accounting, auditing, taxation, and financial management, leading to roles like Chartered Accountant, auditor, or tax consultant. CS (Company Secretary) is another professional course that trains students in company law, corporate governance, and legal aspects of businesses, preparing them to work as legal advisors or company secretaries in corporations. These courses offer vast career opportunities in the corporate world, finance sector, and government organizations.",
                "Arts & Humanities (BA, BFA, BSW)", "Arts & Humanities courses like BA, BFA, and BSW offer a diverse range of subjects for students who have a passion for creative expression, culture, society, and human behavior. BA (Bachelor of Arts) is a 3-year undergraduate degree with specializations in fields like English, History, Political Science, Psychology, Sociology, and Philosophy, providing a broad understanding of human culture and society. BFA (Bachelor of Fine Arts) is a 3-4 year degree that focuses on the development of artistic skills in fields like painting, sculpture, music, dance, theater, and photography, leading to careers in the arts and entertainment industry. BSW (Bachelor of Social Work) is a 3-year program that trains students in social welfare, community development, and human rights, preparing them to work in NGOs, social organizations, and government social services. These courses open up career paths in education, media, arts, public services, and social work.",
                "Science (B.Sc, BCA, B.Sc IT)", "Science courses like B.Sc, BCA, and B.Sc IT are undergraduate programs focused on scientific knowledge, technology, and research, ideal for students who have a keen interest in the natural world, mathematics, and computing. B.Sc (Bachelor of Science) is a 3-year degree offering specializations in fields like Physics, Chemistry, Biology, Mathematics, and Environmental Science, providing a strong foundation for careers in research, education, healthcare, and more. BCA (Bachelor of Computer Applications) is a 3-year course focused on computer programming, software development, networking, and IT systems, preparing students for roles in the IT and software industry. B.Sc IT (Bachelor of Science in Information Technology) is a similar 3-year program with a focus on IT infrastructure, networking, databases, and programming, offering career opportunities in the tech industry. These degrees open up a wide range of job opportunities in research, IT, software development, and academic fields.",
                "Design & Fashion (B.Des, B.FTech)", "Design & Fashion courses like B.Des and B.FTech are creative and professional undergraduate programs that blend artistic expression with technical skills, preparing students for careers in design, fashion, and the creative industries. B.Des (Bachelor of Design) is a 4-year degree that offers specializations in fields like Fashion Design, Interior Design, Product Design, Graphic Design, and Animation, teaching students to create functional and aesthetically appealing designs. B.FTech (Bachelor of Fashion Technology) is a 4-year course focusing on the technical and managerial aspects of the fashion industry, including garment production, textile technology, fashion merchandising, and business management. Both degrees provide opportunities in the fashion, retail, and design industries, offering roles as fashion designers, product designers, fashion technologists, and design consultants. These courses combine creativity with industry knowledge, paving the way for exciting and dynamic careers in the design and fashion world."
        );

        listView.setLayoutManager(new LinearLayoutManager(this));
        listView.setAdapter(new CourseMapAdapter(courses));

    }
}