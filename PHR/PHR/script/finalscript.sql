drop database if exists dn_phr;
create database  dn_phr;
use  dn_phr;



--
-- Table structure for table `dregistration`
--

CREATE TABLE IF NOT EXISTS `dregistration` (
  `txtId` int(11) NOT NULL AUTO_INCREMENT,
  `full_name` varchar(100) NOT NULL,
  `contact_number` varchar(10) NOT NULL,
  `email_id` varchar(100) NOT NULL,
  `answer` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`txtId`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `dregistration`
--

INSERT INTO dregistration (txtId, full_name, contact_number,email_id,answer,password)
VALUES ('1', 'pranay','8087105641','p@gmail.com','nagpur','nagpur');

-- --------------------------------------------------------

--
-- Table structure for table `pregistration`
--



--
-- Dumping data for table `pregistration`
--


-- --------------------------------------------------------

--
-- Table structure for table `sharefile`
--



--
-- Dumping data for table `sharefile`
--