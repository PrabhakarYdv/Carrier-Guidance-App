package com.prabhakar.carrierguidanceapp;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.HashMap;
import java.util.Map;

public class TrendingCoursesActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trending_courses);

        setTitle("Trending Courses");

        Map<String, String> courses = new HashMap<>();
        courses.put("Data Science with Python", "Data Science with Python refers to the use of Python programming to analyze and derive insights from data. Python is widely used in data science due to its simplicity, rich ecosystem of libraries, and flexibility. Key tasks in data science include data collection and cleaning using libraries like Pandas and NumPy, exploratory data analysis (EDA) with tools like Matplotlib and Seaborn, and statistical analysis with SciPy and Statsmodels. Machine learning, powered by libraries like Scikit-learn, TensorFlow, and Keras, is crucial for building models to solve classification, regression, and clustering problems. Data visualization is another key element, where Python offers powerful tools like Matplotlib, Seaborn, and Plotly to create meaningful visualizations. Python also excels in Big Data and cloud computing through PySpark and Dask, as well as in natural language processing (NLP) using NLTK and SpaCy. Deep learning tasks are handled with frameworks such as TensorFlow, Keras, and PyTorch. The typical workflow involves learning Python basics, understanding libraries, and working on projects to apply data manipulation, machine learning, and deep learning techniques. Python's use cases are vast, including business analytics for sales prediction and customer segmentation, healthcare for disease diagnosis and patient outcome prediction, finance for fraud detection and risk assessment, and social media for sentiment analysis and trend forecasting. Data Science with Python enables professionals to extract valuable insights, predict trends, and solve real-world problems across various industries.");
        courses.put("AI & Machine Learning", "AI (Artificial Intelligence) and Machine Learning (ML) are transformative technologies that enable machines to perform tasks that traditionally require human intelligence. AI refers to the simulation of human intelligence in machines to perform tasks such as problem-solving, decision-making, and language understanding. Machine Learning, a subset of AI, involves the development of algorithms that allow machines to learn from and make predictions based on data without being explicitly programmed. Machine Learning techniques include supervised learning, unsupervised learning, and reinforcement learning, which are applied in various fields such as natural language processing, image recognition, and autonomous systems. Key components of AI and ML include data collection, data preprocessing, algorithm selection, model training, and model evaluation. Popular machine learning algorithms include decision trees, support vector machines (SVM), k-nearest neighbors (KNN), and deep learning networks like neural networks. AI applications range from chatbots and virtual assistants to advanced robotics and self-driving cars. Tools and frameworks commonly used in AI/ML development include TensorFlow, Keras, PyTorch, Scikit-learn, and Apache Spark. The AI/ML development process typically involves data exploration, feature engineering, model selection, training, testing, and fine-tuning to ensure accurate predictions. Best practices for AI and ML include handling bias in data, ensuring model transparency, and constantly updating models to adapt to new data. AI and Machine Learning are revolutionizing industries such as healthcare, finance, education, and entertainment by automating processes, improving decision-making, and enabling smarter systems. The potential of AI and ML is vast, offering opportunities for innovation and efficiency across diverse sectors.");

        courses.put("Cybersecurity Fundamentals", "Cybersecurity Fundamentals involve the practices and principles that protect systems, networks, and data from cyberattacks, unauthorized access, and damage. Cybersecurity encompasses a range of techniques designed to safeguard computers, networks, programs, and data from cyber threats such as hacking, phishing, malware, and data breaches. The primary goals of cybersecurity are confidentiality, integrity, and availability—ensuring that data is kept secure, remains accurate, and is accessible when needed. Key components of cybersecurity include network security, information security, application security, endpoint security, and identity and access management. Network security protects the integrity of networks and data as they are transmitted, while information security focuses on securing sensitive data from unauthorized access or alteration. Application security ensures that software applications are designed to prevent vulnerabilities that could be exploited by attackers, and endpoint security safeguards devices like computers, smartphones, and tablets from malicious threats. Identity and access management ensures that only authorized users have access to specific systems or data. Cybersecurity tools and techniques include firewalls, antivirus software, encryption, multi-factor authentication, intrusion detection systems, and regular security audits. A robust cybersecurity strategy often involves risk management, threat assessment, and incident response plans to detect, respond to, and recover from cyberattacks. Best practices for cybersecurity include regularly updating software, using strong passwords, backing up critical data, and educating users about security risks. Cybersecurity is vital across industries, including finance, healthcare, government, and e-commerce, to protect sensitive information, maintain trust, and ensure business continuity. With the increasing number and sophistication of cyberattacks, cybersecurity is becoming an essential part of modern digital infrastructure, requiring constant vigilance, innovation, and adaptation to emerging threats.");

        courses.put("Blockchain & Web3", "Blockchain and Web3 represent revolutionary advancements in digital technology, transforming the way data is stored, managed, and exchanged. Blockchain is a decentralized, distributed ledger technology that enables secure, transparent, and immutable record-keeping of transactions across multiple computers or nodes. It is often associated with cryptocurrencies like Bitcoin and Ethereum but has applications beyond digital currencies, including supply chain management, voting systems, and identity verification. Each \"block\" in a blockchain contains a list of transactions, and these blocks are linked together in a \"chain\" using cryptographic hashes, ensuring data integrity and security. The decentralized nature of blockchain eliminates the need for a central authority, reducing the risk of fraud and manipulation.\n" +
                "\n" +
                "Web3, also known as Web 3.0, is the next generation of the internet that integrates blockchain technology to create decentralized and user-controlled online experiences. Unlike Web2, where user data and content are controlled by centralized platforms like Facebook and Google, Web3 empowers users by allowing them to own and control their data through decentralized applications (dApps) and smart contracts. Web3 relies on blockchain for peer-to-peer interactions, enabling decentralized finance (DeFi), digital identities, and tokenized assets. It uses cryptocurrencies like Ethereum and tools such as NFTs (Non-Fungible Tokens) to represent ownership of digital assets, which can be traded or used within the ecosystem.\n" +
                "\n" +
                "Key components of Blockchain and Web3 include:\n" +
                "\n" +
                "Decentralization: Blockchain and Web3 remove intermediaries, allowing for peer-to-peer transactions, reducing reliance on central authorities.\n" +
                "\n" +
                "Smart Contracts: Self-executing contracts with the terms directly written into code, enabling automatic execution when conditions are met without the need for third-party enforcement.\n" +
                "\n" +
                "Cryptocurrencies: Digital currencies like Bitcoin, Ethereum, and others that utilize blockchain to ensure secure, decentralized transactions.\n" +
                "\n" +
                "Decentralized Applications (dApps): Apps built on blockchain networks that allow users to interact directly with each other without intermediaries. Examples include decentralized exchanges (DEXs) and NFT marketplaces.\n" +
                "\n" +
                "Non-Fungible Tokens (NFTs): Unique digital tokens representing ownership of a specific asset, such as art, music, or real estate, stored on the blockchain, offering proof of ownership and scarcity.\n" +
                "\n" +
                "Web3 Wallets: Digital wallets that allow users to interact with decentralized applications, store cryptocurrencies, and manage NFTs. Examples include MetaMask and Trust Wallet.\n" +
                "\n" +
                "Web3 is envisioned to create a more user-centric internet, where individuals have control over their own data, privacy, and digital identities. However, Web3 is still evolving, and while it promises numerous benefits like increased security, privacy, and ownership, it faces challenges such as scalability, user adoption, and regulation.\n" +
                "\n" +
                "The potential applications of Blockchain and Web3 span various industries, including finance (DeFi), healthcare (secure patient data sharing), supply chain (transparent tracking of goods), and entertainment (digital art and NFTs). With ongoing developments in blockchain technology, Web3 aims to empower users, promote innovation, and create a more open, decentralized internet, reducing the dominance of traditional centralized platforms.");

        courses.put("Data Science with Python", "Data Science with Python refers to the use of Python programming to analyze and derive insights from data. " +
                "Python is widely used in data science due to its simplicity, rich ecosystem of libraries, and flexibility. " +
                "Key tasks in data science include data collection and cleaning using libraries like Pandas and NumPy, " +
                "exploratory data analysis (EDA) with tools like Matplotlib and Seaborn, and statistical analysis with SciPy and Statsmodels. " +
                "Machine learning, powered by libraries like Scikit-learn, TensorFlow, and Keras, is crucial for building models " +
                "to solve classification, regression, and clustering problems. Data visualization is another key element, " +
                "where Python offers powerful tools like Matplotlib, Seaborn, and Plotly to create meaningful visualizations. " +
                "Python also excels in Big Data and cloud computing through PySpark and Dask, as well as in natural language processing (NLP) " +
                "using NLTK and SpaCy. Deep learning tasks are handled with frameworks such as TensorFlow, Keras, and PyTorch. " +
                "Python’s use cases are vast, including business analytics for sales prediction, healthcare for disease diagnosis, " +
                "finance for fraud detection, and social media for sentiment analysis. Data Science with Python enables professionals to extract " +
                "valuable insights, predict trends, and solve real-world problems across various industries."
        );

        courses.put("UI/UX Design", "UI/UX Design refers to the process of designing user interfaces (UI) and user experiences (UX) for digital products, " +
                "aiming to ensure a seamless and enjoyable interaction. UI Design focuses on the visual layout of a product, including elements " +
                "like buttons, icons, typography, and overall aesthetic appeal, while UX Design focuses on the overall user journey, ensuring " +
                "the product meets user needs effectively and is intuitive to navigate. Key components of UI/UX Design include user research, " +
                "wireframing, prototyping, visual design, interaction design, usability testing, and optimizing user flow and navigation. " +
                "Tools commonly used for UI/UX Design include Figma, Adobe XD, Sketch, InVision, Balsamiq, and Axure RP. Good UI/UX Design is " +
                "crucial for improving user satisfaction, increasing conversion rates, fostering brand loyalty, and reducing development costs."
        );

        courses.put("AI & Machine Learning", "AI (Artificial Intelligence) and Machine Learning (ML) are transformative technologies that enable machines to perform tasks " +
                "that traditionally require human intelligence. AI refers to the simulation of human intelligence in machines to perform tasks " +
                "such as problem-solving, decision-making, and language understanding. Machine Learning, a subset of AI, involves the development " +
                "of algorithms that allow machines to learn from and make predictions based on data without being explicitly programmed. " +
                "Machine Learning techniques include supervised learning, unsupervised learning, and reinforcement learning, which are applied " +
                "in various fields such as natural language processing, image recognition, and autonomous systems. Popular machine learning " +
                "algorithms include decision trees, support vector machines (SVM), k-nearest neighbors (KNN), and deep learning networks like neural networks."
        );

        courses.put("Cybersecurity Fundamentals", "Cybersecurity Fundamentals involve the practices and principles that protect systems, networks, and data from cyberattacks, " +
                "unauthorized access, and damage. Cybersecurity encompasses a range of techniques designed to safeguard computers, networks, " +
                "programs, and data from cyber threats such as hacking, phishing, malware, and data breaches. Key components of cybersecurity " +
                "include network security, information security, application security, endpoint security, and identity and access management. " +
                "A robust cybersecurity strategy often involves risk management, threat assessment, and incident response plans to detect, " +
                "respond to, and recover from cyberattacks."
        );

        courses.put("Blockchain & Web3", "Blockchain and Web3 represent revolutionary advancements in digital technology, transforming the way data is stored, managed, " +
                "and exchanged. Blockchain is a decentralized, distributed ledger technology that enables secure, transparent, and immutable " +
                "record-keeping of transactions across multiple computers or nodes. It is often associated with cryptocurrencies like Bitcoin " +
                "and Ethereum but has applications beyond digital currencies, including supply chain management, voting systems, and identity " +
                "verification. Web3 refers to the next generation of the internet, where decentralized applications (dApps) and smart contracts " +
                "enable peer-to-peer transactions without intermediaries. Web3 empowers users by allowing them to control their data and " +
                "own digital assets."
        );

        courses.put("Digital Marketing Mastery", "Digital Marketing Mastery encompasses a broad range of strategies and techniques designed to promote products, services, or " +
                "brands through digital channels. It involves areas like content marketing, SEO (Search Engine Optimization), social media marketing, " +
                "email marketing, PPC (Pay-Per-Click) advertising, influencer marketing, affiliate marketing, and conversion rate optimization (CRO). " +
                "Content marketing focuses on creating valuable and engaging content, while SEO aims to improve website visibility. Social media " +
                "marketing leverages platforms like Facebook, Instagram, and LinkedIn to engage users. PPC advertising drives traffic, and influencer " +
                "marketing partners with influencers. Digital marketing helps brands build awareness, drive traffic, and convert leads into loyal customers."
        );

        courses.put("Cloud Computing", "The course covers cloud services, deployment models, virtualization, and cloud storage solutions. It helps students understand how " +
                "cloud technologies like AWS, Microsoft Azure, and Google Cloud transform businesses by offering scalability, cost efficiency, " +
                "and global reach. Cloud computing professionals are in high demand across sectors like IT, healthcare, and education due to the " +
                "shift towards cloud-based solutions and remote work."
        );

        courses.put("Game Development", "This program teaches the design and development of video games, covering topics like game programming, 3D modeling, and interactive " +
                "design. Game development is growing rapidly, with professionals in demand in gaming studios, tech companies, or as independent game creators."
        );

        courses.put("Robotics", "The robotics course focuses on designing, building, and programming robots for industrial, healthcare, and consumer applications. " +
                "Topics include automation, mechatronics, artificial intelligence, and control systems. Robotics professionals are sought after in " +
                "manufacturing, defense, and healthcare for their precision, speed, and efficiency."
        );

        courses.put("Virtual Reality (VR) & Augmented Reality (AR)", "This course teaches the creation of immersive virtual and augmented experiences using 3D modeling, simulation, and interaction " +
                "design. VR and AR are gaining traction in gaming, education, healthcare, and real estate. As technology evolves, the demand for " +
                "professionals capable of creating engaging AR/VR experiences continues to rise."
        );

        courses.put("Business Analytics", "This program focuses on using data analysis, statistical tools, and software like Excel, R, and Tableau to interpret business " +
                "data and support decision-making. Business analytics is crucial for companies seeking to optimize operations, forecast trends, " +
                "and improve profitability. Professionals in this field are in high demand in retail, finance, and consulting."
        );

        courses.put("Financial Technology (FinTech)", "This course explores the intersection of finance and technology, covering topics like digital payments, blockchain in finance, " +
                "crowdfunding, and cryptocurrency. As the financial services industry adopts technology to improve services and enhance customer " +
                "experience, FinTech professionals are increasingly sought after by banks, insurance companies, and startups."
        );

        courses.put("Health Informatics", "A growing field at the intersection of healthcare and IT, this course covers electronic health records (EHR), telemedicine, " +
                "data analysis, and cybersecurity in healthcare. As the healthcare industry digitizes, health informatics professionals are in " +
                "demand to manage and secure health data."
        );

        courses.put("Sustainability and Environmental Management", "This program teaches students how to manage resources efficiently, minimize environmental impact, and implement sustainable " +
                "practices in various sectors. Topics include environmental laws, renewable energy, waste management, and green building practices. " +
                "Experts in sustainability are sought after to ensure compliance and drive eco-friendly innovations."
        );

        courses.put("Quantum Computing", "This advanced course explores the principles of quantum mechanics as applied to computing, teaching students how to solve " +
                "complex problems faster than traditional computers. Quantum computing has the potential to revolutionize fields like " +
                "cryptography, optimization, and drug discovery, with professionals in high demand as the field evolves."
        );

        courses.put("Ethical Hacking & Penetration Testing", "This course focuses on ethical hacking techniques to identify and fix vulnerabilities in computer systems and networks. It includes " +
                "penetration testing, network security, and cryptography. Ethical hackers are essential for identifying weaknesses before malicious " +
                "hackers can exploit them, making this a high-demand and well-paid career path."
        );

        courses.put("Artificial Intelligence in Healthcare", "This specialized AI course teaches students how to apply artificial intelligence and machine learning in the healthcare industry, " +
                "including areas like diagnostic systems, drug discovery, and patient monitoring. With AI-driven healthcare tools on the rise, " +
                "there is increasing demand for professionals in AI healthcare applications."
        );


        RecyclerView listView = findViewById(R.id.recyclerViewTrendingCourse);
        listView.setLayoutManager(new LinearLayoutManager(this));
        listView.setAdapter(new CourseMapAdapter(courses));
    }
}