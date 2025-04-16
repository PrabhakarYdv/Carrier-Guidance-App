package com.prabhakar.carrierguidanceapp;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.HashMap;
import java.util.Map;

public class TopCollegesActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_colleges);
//        setContentView(R.layout.activity_generic_list);

        RecyclerView listView = findViewById(R.id.recyclerViewTopColleges);

        setTitle("Top Colleges in India");

        Map<String, String> colleges = new HashMap<>();

        colleges.put("IIT Bombay", "IIT Bombay (Indian Institute of Technology Bombay), established in 1958, is one of India's premier institutions located in Powai, Mumbai, with a sprawling 550-acre urban campus. It offers a diverse range of academic programs...");
        colleges.put("IIT Delhi", "IIT Delhi (Indian Institute of Technology Delhi), established in 1961, is a premier public engineering institution located in New Delhi, India. Spanning a 325-acre urban campus, it offers a wide range of academic programs...");
        colleges.put("AIIMS Delhi", "AIIMS Delhi (All India Institute of Medical Sciences, New Delhi), established in 1956, is India's premier medical research university and hospital located in Ansari Nagar, New Delhi...");
        colleges.put("St. Stephen's College", "St. Stephen's College, Delhi, established on February 1, 1881, is the oldest college in Delhi and one of the founding institutions of the University of Delhi...");
        colleges.put("IIM Ahmedabad", "Indian Institute of Management Ahmedabad (IIMA), established in 1961, is one of India's premier business schools, renowned for its academic excellence and global recognition...");
        colleges.put("NIFT Delhi", "National Institute of Fashion Technology (NIFT) Delhi, established in 1986, is India's premier institute for fashion education, located in Hauz Khas, New Delhi...");
        colleges.put("Delhi University", "Delhi University (DU), officially known as the University of Delhi, was established in 1922 and is one of India's leading institutions of higher learning...");
        colleges.put("College of Engineering Pune", "The College of Engineering Pune (COEP) is one of India’s oldest and most prestigious engineering institutions, established in 1854, located in Pune, Maharashtra...");
        colleges.put("VJTI Mumbai", "Veermata Jijabai Technological Institute (VJTI) Mumbai, established in 1887, is one of India’s oldest and most respected engineering institutions, located in the bustling city of Mumbai...");
        colleges.put("SPIT Mumbai", "Sardar Patel Institute of Technology (SPIT) Mumbai, established in 2005, is a reputed autonomous engineering institute located in Andheri West, Mumbai, Maharashtra...");
        colleges.put("Pune Institute of Computer Technology (PICT), Pune", "Pune Institute of Computer Technology (PICT), Pune, established in 1983, is one of Maharashtra’s leading engineering colleges, renowned especially for its excellence in Computer, IT, and E&TC Engineering education...");
        colleges.put("Walchand College of Engineering, Sangli", "Walchand College of Engineering, Sangli (WCE), established in 1947, is one of Maharashtra’s oldest and most reputed autonomous engineering institutes, affiliated with Shivaji University...");
        colleges.put("Government College of Engineering, Aurangabad (GECA)", "Government College of Engineering, Aurangabad (GECA), established in 1960, is a prominent autonomous engineering institution in Maharashtra, affiliated with Dr. Babasaheb Ambedkar Marathwada University...");
        colleges.put("MIT WPU (MIT World Peace University), Pune","MIT World Peace University (MIT-WPU), Pune, established in 1983 as part of the MIT Group and rebranded in 2017, is a prominent private deemed-to-be university located in Kothrud, Pune, Maharashtra. Known for its emphasis on holistic education, world peace, and human values, MIT-WPU offers a wide spectrum of academic programs including undergraduate, postgraduate, diploma, and doctoral courses in Engineering, Management, Commerce, Law, Pharmacy, Liberal Arts, Sciences, Journalism, and Design. The university is recognized by UGC, approved by AICTE for technical programs, accredited by NAAC, and a member of AIU. Spread over a modern urban campus, it features advanced labs, auditoriums, libraries, hostels, sports complexes, and innovation centers, fostering a dynamic learning atmosphere. MIT-WPU is renowned for initiatives like its annual World Peace Conference and cultural and technical fests such as Tech Mahotsav, reflecting its commitment to values-driven education. The university has established strong industry connections with leading recruiters like TCS, Infosys, Cognizant, Capgemini, Tech Mahindra, and HDFC Bank, ensuring excellent placement opportunities for students while actively promoting entrepreneurship and start-up culture through its innovation programs and incubation centers.");
        colleges.put("VIT Pune (Vishwakarma Institute of Technology)","Vishwakarma Institute of Technology (VIT), Pune, established in 1983, is a prominent autonomous engineering institution affiliated with Savitribai Phule Pune University and managed by the Bansilal Ramnath Agarwal Charitable Trust. Initially operating from a modest setup, it relocated to its current Bibwewadi campus in 1987, marking the beginning of its significant academic journey. VIT offers undergraduate, postgraduate, and doctoral programs across various engineering disciplines, including Chemical, Computer, Electronics, Mechanical, and Information Technology. The institute is approved by AICTE and has earned an A++ Grade from NAAC. In the NIRF 2023 ranking, VIT Pune was placed in the 151-200 band under the \"Engineering\" category.The campus is equipped with modern facilities such as advanced laboratories, libraries, sports complexes, and hostels, fostering a conducive environment for learning and personal growth. VIT is renowned for its strong placement records, with students securing positions in leading companies across various sectors. With over four decades of excellence in education, VIT continues to be a preferred choice for aspiring engineers, offering a blend of academic rigor and holistic development.");
        colleges.put("Bharti Vidyapeeth College of Engineering, Pune","Bharati Vidyapeeth College of Engineering (BVCOE), Pune, established in 1983 by Dr. Patangrao Kadam, is a constituent unit of Bharati Vidyapeeth (Deemed to be University). Located in Dhankawadi, Pune, the college offers undergraduate, postgraduate, and doctoral programs in various engineering disciplines, including Civil, Mechanical, Electrical, Electronics, Computer Science, and Information Technology. The institution is recognized by UGC, NAAC, NBA, and AICTE. BVCOE is ranked in the 151–200 band in the NIRF 2024 Engineering category.The campus spans approximately 85 acres and is equipped with 101 laboratories, 43 classrooms, 21 tutorial rooms, a five-story library housing over 69,000 books and 19,000 volumes, 72 national and 70 international journal subscriptions, a digital library, computer center, auditorium, seminar halls, audio-video halls, playground, gymnasium, cafeteria, general store, bank, and hostels for boys and girls. \u200B\nAdmissions to B.Tech programs are primarily through the Bharati Vidyapeeth Common Entrance Test (BVPCET), with additional seats available through JEE Main, MHT CET, and management quota. For M.Tech programs, admission is based on the BVPCET, GATE, MHT CET, and management quota.");
        colleges.put(". Sinhgad College of Engineering, Pune","Sinhgad College of Engineering (SCOE), established in 1996, is a private unaided institution located in Vadgaon Budruk, Pune, Maharashtra. Affiliated with Savitribai Phule Pune University and approved by AICTE, SCOE offers a range of undergraduate and postgraduate engineering programs. The undergraduate courses include Mechanical, Computer, Electronics & Telecommunication, Civil, Information Technology, Chemical, Production, and Bio-Technology Engineering, with a total intake of 1,200 students. At the postgraduate level, the college provides M.Tech programs in areas such as Structural Engineering, VLSI Design, and Power Systems. Admissions are primarily through MHT-CET and JEE Main for B.Tech, GATE for M.Tech, and MAH-MBA/MMS-CET or CAT for MBA programs. The campus spans 50 acres and is equipped with modern infrastructure, including state-of-the-art laboratories, hostels, and sports facilities. SCOE has a strong placement record, with students securing positions in reputed companies like Accenture and Cognizant. The college emphasizes holistic development through various extracurricular activities and has a robust alumni network.");


        listView.setLayoutManager(new LinearLayoutManager(this));
        listView.setAdapter(new CourseMapAdapter(colleges));
    }
}